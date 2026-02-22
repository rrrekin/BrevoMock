package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.ProgramApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class ProgramApiController : ProgramApi {
    override fun createNewLP(createNewLPRequest: eu.rrrekin.brevo.model.CreateNewLPRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.LoyaltyProgram> {
        throw NotImplementedException("Program")
    }
    override fun deleteContactMembers(pid: java.util.UUID, memberContactIds: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Program")
    }
    override fun deleteLoyaltyProgram(pid: java.util.UUID): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Program")
    }
    override fun getLPList(limit: kotlin.Int?, offset: kotlin.Int?, sortField: kotlin.String?, sort: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetLPList200Response> {
        throw NotImplementedException("Program")
    }
    override fun getLoyaltyProgramInfo(pid: java.util.UUID): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.LoyaltyProgram> {
        throw NotImplementedException("Program")
    }
    override fun getParameterSubscriptionInfo(pid: java.util.UUID, contactId: kotlin.String?, params: kotlin.String?, loyaltySubscriptionId: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetParameterSubscriptionInfo200Response> {
        throw NotImplementedException("Program")
    }
    override fun partiallyUpdateLoyaltyProgram(pid: java.util.UUID, partiallyUpdateLoyaltyProgramRequest: eu.rrrekin.brevo.model.PartiallyUpdateLoyaltyProgramRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.LoyaltyProgram> {
        throw NotImplementedException("Program")
    }
    override fun publishLoyaltyProgram(pid: java.util.UUID): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Program")
    }
    override fun subscribeMemberToASubscription(pid: java.util.UUID, subscribeMemberToASubscriptionRequest: eu.rrrekin.brevo.model.SubscribeMemberToASubscriptionRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.SubscribeMemberToASubscription200Response> {
        throw NotImplementedException("Program")
    }
    override fun subscribeToLoyaltyProgram(pid: java.util.UUID, subscribeToLoyaltyProgramRequest: eu.rrrekin.brevo.model.SubscribeToLoyaltyProgramRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.SubscribeToLoyaltyProgram200Response> {
        throw NotImplementedException("Program")
    }
    override fun updateLoyaltyProgram(pid: java.util.UUID, updateLoyaltyProgramRequest: eu.rrrekin.brevo.model.UpdateLoyaltyProgramRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.LoyaltyProgram> {
        throw NotImplementedException("Program")
    }
}
