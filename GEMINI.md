# Brevo API Mock - Project Guidelines

## Project Context
The **Brevo API Mock** is a local development and test environment replacement for the real Brevo API service. Rather than hitting actual external API endpoints, applications can point to this service to verify integration logic, inspect sent transactional emails, and manage mock contacts.

## Core Technologies
- **Language**: Kotlin 2.1+
- **Framework**: Spring Boot 4.0.3+
- **Build Tool**: Gradle (Kotlin DSL) with **Centralized Catalog Versioning** (`gradle/libs.versions.toml`).
- **Web UI**: Thymeleaf + HTMX + Vanilla CSS/Tailwind for a premium, lightweight management interface.
- **Database**: Spring Data JDBC. Defaults to **H2** or **SQLite** for zero-setup execution, with profiles for PostgreSQL and MySQL.
- **API Spec**: OpenAPI 3 generator plugin to scaffold exact Brevo endpoints.

## Development Rules
1. **Centralized Dependencies**: All dependencies MUST be declared in `gradle/libs.versions.toml`. Do not hardcode versions in `build.gradle.kts`.
2. **Immutability**: Favor Kotlin `data class` and `val` over mutable state wherever possible in business logic.
3. **Beautiful UI**: The HTMX Management UI must be clean, modern, dynamic, and instantly responsive without full page reloads.
4. **Mock Accuracy**: Endpoint URLs and Request/Response bodies must strictly match the Brevo OpenAPI spec.

## Workflows
- **Local Development**: Standard JVM execution via `./gradlew bootRun`.
- **Releases/Native**: AOT (Ahead-of-Time) compilation using GraalVM. Build the native binary with `./gradlew nativeCompile`.
- **Testing**: Test suite via `./gradlew check`. Native tests via `./gradlew nativeTest`.

## Additional Requirements
- **Security Check**: Every development step must be followed by a security review of the change.
- **Testing**: The code must be comprehensively covered with tests using **JUnit 6**.
- **IDE Limitation (VS Code)**: The official VS Code Kotlin extension (`fwcd.kotlin`) currently bundles a standard Kotlin compiler `2.1.0`. When the project uses Kotlin `2.3.10` via Gradle, the Language Server will show a spurious error about incompatible Kotlin metadata version (2.3.0 vs 2.1.0 compiler). **This error is safe to ignore** as the underlying Gradle build works correctly. For full IDE support without errors, consider using IntelliJ IDEA.
