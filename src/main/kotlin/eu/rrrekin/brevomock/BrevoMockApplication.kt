package eu.rrrekin.brevomock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["eu.rrrekin.brevomock", "eu.rrrekin.brevo", "org.openapitools"])
@ConfigurationPropertiesScan(basePackages = ["eu.rrrekin.brevomock", "eu.rrrekin.brevo"])
class BrevoMockApplication

fun main(args: Array<String>) {
    runApplication<BrevoMockApplication>(*args)
}
