package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.TierApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class TierApiController : TierApi {
    override fun addSubscriptionToTier(pid: java.util.UUID, cid: java.util.UUID, tid: java.util.UUID): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.AddSubscriptionToTier200Response> {
        throw NotImplementedException("Tier")
    }
    override fun createTierForTierGroup(pid: java.util.UUID, gid: java.util.UUID, createTierForTierGroupRequest: eu.rrrekin.brevo.model.CreateTierForTierGroupRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Tier> {
        throw NotImplementedException("Tier")
    }
    override fun createTierGroup(pid: java.util.UUID, createTierGroupRequest: eu.rrrekin.brevo.model.CreateTierGroupRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.TierGroup> {
        throw NotImplementedException("Tier")
    }
    override fun deleteTier(pid: java.util.UUID, tid: java.util.UUID): org.springframework.http.ResponseEntity<kotlin.String> {
        throw NotImplementedException("Tier")
    }
    override fun deleteTierGroup(pid: java.util.UUID, gid: java.util.UUID): org.springframework.http.ResponseEntity<kotlin.String> {
        throw NotImplementedException("Tier")
    }
    override fun getListOfTierGroups(pid: java.util.UUID, version: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetListOfTierGroups200Response> {
        throw NotImplementedException("Tier")
    }
    override fun getLoyaltyProgramTier(pid: java.util.UUID, version: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetLoyaltyProgramTier200Response> {
        throw NotImplementedException("Tier")
    }
    override fun getTierGroup(pid: java.util.UUID, gid: java.util.UUID, version: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.TierGroup> {
        throw NotImplementedException("Tier")
    }
    override fun updateTier(pid: java.util.UUID, tid: java.util.UUID, updateTierRequest: eu.rrrekin.brevo.model.UpdateTierRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Tier> {
        throw NotImplementedException("Tier")
    }
    override fun updateTierGroup(pid: java.util.UUID, gid: java.util.UUID, updateTierGroupRequest: eu.rrrekin.brevo.model.UpdateTierGroupRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.TierGroup> {
        throw NotImplementedException("Tier")
    }
}
