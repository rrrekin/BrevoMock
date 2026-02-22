package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.RewardApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class RewardApiController : RewardApi {
    override fun completeRedeemTransaction(pid: java.util.UUID, tid: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Redeem> {
        throw NotImplementedException("Reward")
    }
    override fun createReward(pid: java.util.UUID, createRewardRequest: eu.rrrekin.brevo.model.CreateRewardRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateReward200Response> {
        throw NotImplementedException("Reward")
    }
    override fun createVoucher(pid: java.util.UUID, createVoucherRequest: eu.rrrekin.brevo.model.CreateVoucherRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateVoucher200Response> {
        throw NotImplementedException("Reward")
    }
    override fun getCodeCount(pid: java.util.UUID, cpid: java.util.UUID): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetCodeCount200Response> {
        throw NotImplementedException("Reward")
    }
    override fun loyaltyOfferProgramsPidOffersGet(pid: java.util.UUID, limit: kotlin.Int, offset: kotlin.Int, state: kotlin.String, version: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.LoyaltyOfferProgramsPidOffersGet200Response> {
        throw NotImplementedException("Reward")
    }
    override fun loyaltyOfferProgramsPidRewardsRidGet(pid: java.util.UUID, rid: java.util.UUID, version: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.LoyaltyOfferProgramsPidRewardsRidGet200Response> {
        throw NotImplementedException("Reward")
    }
    override fun loyaltyOfferProgramsPidVouchersGet(pid: java.util.UUID, contactId: kotlin.Int, limit: kotlin.Int, offset: kotlin.Int, sort: kotlin.String, sortField: kotlin.String, metadataKeyValue: kotlin.String?, rewardId: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.LoyaltyOfferProgramsPidVouchersGet200Response> {
        throw NotImplementedException("Reward")
    }
    override fun redeemVoucher(pid: java.util.UUID, redeemVoucherRequest: eu.rrrekin.brevo.model.RedeemVoucherRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Redeem> {
        throw NotImplementedException("Reward")
    }
    override fun revokeVouchers(pid: java.util.UUID, attributedRewardIds: kotlin.String?): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Reward")
    }
    override fun validateReward(pid: java.util.UUID, validateRewardRequest: eu.rrrekin.brevo.model.ValidateRewardRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ValidateReward200Response> {
        throw NotImplementedException("Reward")
    }
}
