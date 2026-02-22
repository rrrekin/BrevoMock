package eu.rrrekin.brevo.exception

import eu.rrrekin.brevo.config.BrevoProperties
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class RestExceptionHandler(private val brevoProperties: BrevoProperties) {

    @ExceptionHandler(NotImplementedException::class)
    fun handleNotImplemented(ex: NotImplementedException): ResponseEntity<Map<String, Any>> {
        val issueNumber = brevoProperties.issues[ex.domain]
        val message = if (issueNumber != null) {
            "API endpoint for domain '${ex.domain}' is not implemented yet. See GitHub Issue #$issueNumber"
        } else {
            "API endpoint for domain '${ex.domain}' is not implemented yet. Tracking issue not found."
        }

        return ResponseEntity(
            mapOf(
                "code" to "not_implemented",
                "message" to message
            ),
            HttpStatus.NOT_IMPLEMENTED
        )
    }
}
