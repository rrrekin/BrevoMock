import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
    kotlin("jvm") version "2.2.0"
    kotlin("plugin.spring") version "2.2.0"
    kotlin("kapt") version "2.2.0"
    id("org.springframework.boot") version "4.0.0-SNAPSHOT"
    id("io.spring.dependency-management") version "1.1.7"
    id("org.graalvm.buildtools.native") version "0.11.0"
    id("org.openapi.generator") version "7.14.0"
}

group = "eu.rrrekin"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
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
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    // Needed for @Schema annotations used in OpenAPI-generated models
    implementation("io.swagger.core.v3:swagger-annotations:2.2.22")
    implementation("io.swagger.core.v3:swagger-models:2.2.22")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    kapt("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// Directory where generated sources will be placed
val openApiOutputDir = layout.buildDirectory.dir("generated/sources/openapi")

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict", "-Xannotation-default-target=param-property")
    }
    sourceSets {
        val main by getting {
            kotlin.srcDir(openApiOutputDir.map { it.dir("src/main/kotlin") })
        }
    }
}

// Location for the OpenAPI definition file you will provide
val openApiSpec = layout.projectDirectory.file("src/main/openapi/brevo_v3.yml")

// Task to generate Kotlin Spring server stubs from the OpenAPI definition
val generateOpenApiServer by tasks.registering(GenerateTask::class) {
    group = "openapi"
    description = "Generates Kotlin Spring server stubs from OpenAPI spec"
    inputSpec.set(openApiSpec.asFile.path)
    generatorName.set("kotlin-spring")
    library.set("spring-boot")
    outputDir.set(openApiOutputDir.map { it.asFile.absolutePath })
    apiPackage.set("eu.rrrekin.brevomock.openapi.api")
    modelPackage.set("eu.rrrekin.brevomock.openapi.model")
    configOptions.set(
        mapOf(
            "interfaceOnly" to "true",
            "useTags" to "true",
            "useSpringBoot3" to "true",
            "dateLibrary" to "java8",
            "useSwaggerAnnotations" to "true",
            "sourceFolder" to "src/main/kotlin"
        )
    )
    // Additional generator properties
    additionalProperties.set(
        mapOf(
            "hideGenerationTimestamp" to true
        )
    )
    globalProperties.set(
        mapOf(
            "apiDocs" to "false",
            "modelDocs" to "false",
            "apiTests" to "false",
            "modelTests" to "false"
        )
    )
}


// Ensure OpenAPI sources are generated before Kotlin compilation
tasks.named<KotlinCompile>("compileKotlin") {
    dependsOn(generateOpenApiServer)
}

// KAPT stub generation also needs generated OpenAPI sources
// Avoid referencing internal task classes; match by task name for stability across Kotlin versions
tasks.matching { it.name.contains("kaptGenerateStubs") }.configureEach {
    dependsOn(generateOpenApiServer)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
