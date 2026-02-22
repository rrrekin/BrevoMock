package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.InboundParsingApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class InboundParsingApiController : InboundParsingApi {
    override fun getInboundEmailAttachment(downloadToken: kotlin.String): org.springframework.http.ResponseEntity<org.springframework.core.io.Resource> {
        throw NotImplementedException("InboundParsing")
    }
    override fun getInboundEmailEvents(sender: kotlin.String?, startDate: kotlin.String?, endDate: kotlin.String?, limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetInboundEmailEvents200Response> {
        throw NotImplementedException("InboundParsing")
    }
    override fun getInboundEmailEventsByUuid(uuid: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetInboundEmailEventsByUuid200Response> {
        throw NotImplementedException("InboundParsing")
    }
}
