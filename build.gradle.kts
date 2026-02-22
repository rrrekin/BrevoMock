plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependency.management)
    alias(libs.plugins.openapi.generator)
    alias(libs.plugins.graalvm.buildtools)
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

springBoot {
    mainClass.set("eu.rrrekin.brevomock.BrevoMockApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.spring.boot.starter.web)
    implementation(kotlin("reflect"))
    implementation(libs.spring.boot.starter.data.jdbc)
    implementation(libs.spring.boot.starter.validation)
    implementation(libs.spring.boot.starter.thymeleaf)
    
    implementation(libs.flyway.core)
    
    runtimeOnly(libs.h2)
    runtimeOnly(libs.postgresql)
    runtimeOnly(libs.mysql)
    
    // UI
    implementation(libs.webjars.htmx)

    // OpenAPI generator requested deps
    implementation(libs.swagger.annotations)
    implementation(libs.swagger.models)
    
    testImplementation(libs.spring.boot.starter.test)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

openApiGenerate {
    generatorName.set("kotlin-spring")
    inputSpec.set("$rootDir/src/main/resources/api/brevo.yaml")
    outputDir.set("$buildDir/generated/openapi")
    apiPackage.set("eu.rrrekin.brevo.api")
    modelPackage.set("eu.rrrekin.brevo.model")
    configOptions.set(mapOf(
        "useSpringBoot3" to "true",
        "delegatePattern" to "false",
        "interfaceOnly" to "true",
        "enumPropertyNaming" to "original",
        "exceptionHandler" to "false",
        "useTags" to "true"
    ))
}

kotlin {
    sourceSets.main {
        kotlin.srcDir("$buildDir/generated/openapi/src/main/kotlin")
    }
}

tasks.named("compileKotlin") {
    dependsOn("openApiGenerate")
}
