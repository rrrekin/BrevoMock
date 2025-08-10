import org.openapitools.generator.gradle.plugin.tasks.GenerateTask
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

plugins {
    kotlin("jvm") version "2.2.0"
    kotlin("plugin.spring") version "2.2.0"
    id("org.springframework.boot") version "4.0.0-SNAPSHOT"
    id("io.spring.dependency-management") version "1.1.7"
    id("org.graalvm.buildtools.native") version "0.11.0"
    id("org.openapi.generator") version "7.6.0"
}

group = "eu.rrrekin"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-flyway")
    implementation("org.springframework.boot:spring-boot-starter-jooq")
    implementation("org.springframework.boot:spring-boot-starter-restclient")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("io.swagger.core.v3:swagger-annotations:2.2.22")
    implementation("io.swagger.core.v3:swagger-models:2.2.22")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict", "-Xannotation-default-target=param-property")
    }
    sourceSets {
        val main by getting {
            kotlin.srcDir(layout.buildDirectory.dir("generated/sources/openapi").map { it.dir("src/main/kotlin") })
        }
    }
}

// Directory where generated sources will be placed
val openApiOutputDir = layout.buildDirectory.dir("generated/sources/openapi")

// Location for the OpenAPI definition file you will provide
val openApiSpec = layout.projectDirectory.file("src/main/openapi/brevo_v3.yml")

// Task to generate Kotlin Spring server stubs from the OpenAPI definition
val generateOpenApiServer by tasks.registering(GenerateTask::class) {
    group = "openapi"
    description = "Generates Kotlin Spring server stubs from OpenAPI spec"
    inputSpec.set(openApiSpec.asFile.path)
    generatorName.set("kotlin-spring")
    library.set("spring-boot")
    outputDir.set(openApiOutputDir.get().asFile.path)
    packageName.set("eu.rrrekin.brevomock.openapi")
    apiPackage.set("eu.rrrekin.brevomock.openapi.api")
    modelPackage.set("eu.rrrekin.brevomock.openapi.model")
    invokerPackage.set("eu.rrrekin.brevomock.openapi.invoker")
    configOptions.set(mapOf(
        "interfaceOnly" to "true",
        "useTags" to "true",
        "useSpringBoot3" to "true",
        "dateLibrary" to "java8"
    ))
    // Additional generator properties
    additionalProperties.set(mapOf(
        "hideGenerationTimestamp" to true
    ))
}


// Ensure OpenAPI sources are generated before Kotlin compilation
tasks.named("compileKotlin") {
    dependsOn("generateOpenApiServer")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
