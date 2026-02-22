package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.BalanceApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class BalanceApiController : BalanceApi {
    override fun beginTransaction(pid: java.util.UUID, beginTransactionRequest: eu.rrrekin.brevo.model.BeginTransactionRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Transaction> {
        throw NotImplementedException("Balance")
    }
    override fun cancelTransaction(pid: java.util.UUID, tid: java.util.UUID): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Transaction> {
        throw NotImplementedException("Balance")
    }
    override fun completeTransaction(pid: java.util.UUID, tid: java.util.UUID): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Transaction> {
        throw NotImplementedException("Balance")
    }
    override fun createBalanceLimit(pid: java.util.UUID, bdid: java.util.UUID, createBalanceLimitRequest: eu.rrrekin.brevo.model.CreateBalanceLimitRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.BalanceLimit> {
        throw NotImplementedException("Balance")
    }
    override fun createBalanceOrder(pid: java.util.UUID, createBalanceOrderRequest: eu.rrrekin.brevo.model.CreateBalanceOrderRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateBalanceOrder200Response> {
        throw NotImplementedException("Balance")
    }
    override fun deleteBalanceDefinition(pid: java.util.UUID, bdid: java.util.UUID): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Balance")
    }
    override fun deleteBalanceLimit(pid: java.util.UUID, bdid: java.util.UUID, blid: java.util.UUID): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Balance")
    }
    override fun getBalanceDefinition(pid: java.util.UUID, bdid: java.util.UUID, version: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.BalanceDefinition> {
        throw NotImplementedException("Balance")
    }
    override fun getBalanceDefinitionList(pid: java.util.UUID, limit: kotlin.Int, offset: kotlin.Int, sortField: kotlin.String, sort: kotlin.String, version: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetBalanceDefinitionList200Response> {
        throw NotImplementedException("Balance")
    }
    override fun getBalanceLimit(pid: java.util.UUID, bdid: java.util.UUID, blid: java.util.UUID, version: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.BalanceLimit> {
        throw NotImplementedException("Balance")
    }
    override fun getContactBalances(pid: java.util.UUID): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetContactBalances200Response> {
        throw NotImplementedException("Balance")
    }
    override fun getSubscriptionBalances(cid: kotlin.String, pid: java.util.UUID): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSubscriptionBalances200Response> {
        throw NotImplementedException("Balance")
    }
    override fun loyaltyBalanceProgramsPidActiveBalanceGet(pid: java.util.UUID, contactId: kotlin.Int, balanceDefinitionId: java.util.UUID, limit: kotlin.Int?, offset: kotlin.Int?, sortField: kotlin.String?, sort: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.BalanceLimit> {
        throw NotImplementedException("Balance")
    }
    override fun loyaltyBalanceProgramsPidBalanceDefinitionsPost(pid: java.util.UUID, loyaltyBalanceProgramsPidBalanceDefinitionsPostRequest: eu.rrrekin.brevo.model.LoyaltyBalanceProgramsPidBalanceDefinitionsPostRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.BalanceDefinition> {
        throw NotImplementedException("Balance")
    }
    override fun loyaltyBalanceProgramsPidSubscriptionsCidBalancesPost(pid: java.util.UUID, cid: java.util.UUID, loyaltyBalanceProgramsPidSubscriptionsCidBalancesPostRequest: eu.rrrekin.brevo.model.LoyaltyBalanceProgramsPidSubscriptionsCidBalancesPostRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.LoyaltyBalanceProgramsPidSubscriptionsCidBalancesPost200Response> {
        throw NotImplementedException("Balance")
    }
    override fun loyaltyBalanceProgramsPidTransactionHistoryGet(pid: java.util.UUID, contactId: kotlin.Int, balanceDefinitionId: java.util.UUID, limit: kotlin.Int, offset: kotlin.Int, sortField: kotlin.String, sort: kotlin.String, filters: kotlin.collections.List<kotlin.String>?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.LoyaltyBalanceProgramsPidTransactionHistoryGet200Response> {
        throw NotImplementedException("Balance")
    }
    override fun updateBalanceDefinition(pid: java.util.UUID, bdid: java.util.UUID, updateBalanceDefinitionRequest: eu.rrrekin.brevo.model.UpdateBalanceDefinitionRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.BalanceDefinition> {
        throw NotImplementedException("Balance")
    }
    override fun updateBalanceLimit(pid: java.util.UUID, bdid: java.util.UUID, blid: java.util.UUID, updateBalanceLimitRequest: eu.rrrekin.brevo.model.UpdateBalanceLimitRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.BalanceLimit> {
        throw NotImplementedException("Balance")
    }
}
