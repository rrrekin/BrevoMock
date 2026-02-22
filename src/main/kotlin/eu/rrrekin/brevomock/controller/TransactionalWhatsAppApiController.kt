package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.TransactionalWhatsAppApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class TransactionalWhatsAppApiController : TransactionalWhatsAppApi {
    override fun getWhatsappEventReport(limit: kotlin.Long, offset: kotlin.Long, startDate: kotlin.String?, endDate: kotlin.String?, days: kotlin.Long?, contactNumber: kotlin.String?, event: kotlin.String?, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetWhatsappEventReport200Response> {
        throw NotImplementedException("TransactionalWhatsApp")
    }
    override fun sendWhatsappMessage(sendWhatsappMessageRequest: eu.rrrekin.brevo.model.SendWhatsappMessageRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.SendWhatsappMessage201Response> {
        throw NotImplementedException("TransactionalWhatsApp")
    }
}
