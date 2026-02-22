package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.AccountApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountApiController : AccountApi {
    override fun getAccount(): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetAccount200Response> {
        throw NotImplementedException("Account")
    }
    override fun getAccountActivity(startDate: kotlin.String?, endDate: kotlin.String?, email: kotlin.String?, limit: kotlin.Long, offset: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetAccountActivity200Response> {
        throw NotImplementedException("Account")
    }
}
