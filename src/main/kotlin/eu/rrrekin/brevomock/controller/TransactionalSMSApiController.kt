package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.TransactionalSMSApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class TransactionalSMSApiController : TransactionalSMSApi {
    override fun getSmsEvents(limit: kotlin.Long, startDate: kotlin.String?, endDate: kotlin.String?, offset: kotlin.Long, days: kotlin.Long?, phoneNumber: kotlin.String?, event: kotlin.String?, tags: kotlin.String?, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSmsEvents200Response> {
        throw NotImplementedException("TransactionalSMS")
    }
    override fun getTransacAggregatedSmsReport(startDate: kotlin.String?, endDate: kotlin.String?, days: kotlin.Long?, tag: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetTransacAggregatedSmsReport200Response> {
        throw NotImplementedException("TransactionalSMS")
    }
    override fun getTransacSmsReport(startDate: kotlin.String?, endDate: kotlin.String?, days: kotlin.Long?, tag: kotlin.String?, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetTransacSmsReport200Response> {
        throw NotImplementedException("TransactionalSMS")
    }
    override fun sendAsyncTransactionalSms(sendTransacSms: eu.rrrekin.brevo.model.SendTransacSms): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.SendAsyncTransactionalSms201Response> {
        throw NotImplementedException("TransactionalSMS")
    }
    override fun sendTransacSms(sendTransacSms: eu.rrrekin.brevo.model.SendTransacSms): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.SendTransacSms201Response> {
        throw NotImplementedException("TransactionalSMS")
    }
}
