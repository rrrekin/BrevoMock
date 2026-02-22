package eu.rrrekin.brevo.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "brevo")
class BrevoProperties {
    var issues: Map<String, Int> = mutableMapOf()
}
