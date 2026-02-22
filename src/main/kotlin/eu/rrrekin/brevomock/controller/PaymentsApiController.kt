package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.PaymentsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class PaymentsApiController : PaymentsApi {
    override fun createPaymentRequest(createPaymentRequestRequest: eu.rrrekin.brevo.model.CreatePaymentRequestRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreatePaymentRequest201Response> {
        throw NotImplementedException("Payments")
    }
    override fun deletePaymentRequest(id: java.util.UUID): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Payments")
    }
    override fun getPaymentRequest(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetPaymentRequest200Response> {
        throw NotImplementedException("Payments")
    }
}
