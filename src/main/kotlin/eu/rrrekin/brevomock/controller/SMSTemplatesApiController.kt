package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.SMSTemplatesApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class SMSTemplatesApiController : SMSTemplatesApi {
    override fun getSMSTemplates(limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSMSTemplates200Response> {
        throw NotImplementedException("SMSTemplates")
    }
}
