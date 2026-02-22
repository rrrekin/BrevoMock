package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.SendersApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class SendersApiController : SendersApi {
    override fun createSender(sender: eu.rrrekin.brevo.model.CreateSenderRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateSender201Response> {
        throw NotImplementedException("Senders")
    }
    override fun deleteSender(senderId: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Senders")
    }
    override fun getIps(): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetIps200Response> {
        throw NotImplementedException("Senders")
    }
    override fun getIpsFromSender(senderId: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetIpsFromSender200Response> {
        throw NotImplementedException("Senders")
    }
    override fun getSenders(ip: kotlin.String?, domain: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSenders200Response> {
        throw NotImplementedException("Senders")
    }
    override fun updateSender(senderId: kotlin.Long, sender: eu.rrrekin.brevo.model.UpdateSenderRequest?): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Senders")
    }
    override fun validateSenderByOTP(senderId: kotlin.Long, sender: eu.rrrekin.brevo.model.ValidateSenderByOTPRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Senders")
    }
}
