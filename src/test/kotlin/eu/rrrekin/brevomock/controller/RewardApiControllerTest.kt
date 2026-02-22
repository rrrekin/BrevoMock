package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class RewardApiControllerTest {
    private val controller = RewardApiController()
    @Test
    fun `test completeRedeemTransaction`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.completeRedeemTransaction(mock(java.util.UUID::class.java), "test")
        }
        assertEquals("Reward", exception.domain)
    }
    @Test
    fun `test createReward`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createReward(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.CreateRewardRequest::class.java))
        }
        assertEquals("Reward", exception.domain)
    }
    @Test
    fun `test createVoucher`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createVoucher(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.CreateVoucherRequest::class.java))
        }
        assertEquals("Reward", exception.domain)
    }
    @Test
    fun `test getCodeCount`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getCodeCount(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java))
        }
        assertEquals("Reward", exception.domain)
    }
    @Test
    fun `test loyaltyOfferProgramsPidOffersGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.loyaltyOfferProgramsPidOffersGet(mock(java.util.UUID::class.java), 1, 1, "test", "test")
        }
        assertEquals("Reward", exception.domain)
    }
    @Test
    fun `test loyaltyOfferProgramsPidRewardsRidGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.loyaltyOfferProgramsPidRewardsRidGet(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), "test")
        }
        assertEquals("Reward", exception.domain)
    }
    @Test
    fun `test loyaltyOfferProgramsPidVouchersGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.loyaltyOfferProgramsPidVouchersGet(mock(java.util.UUID::class.java), 1, 1, 1, "test", "test", null, null)
        }
        assertEquals("Reward", exception.domain)
    }
    @Test
    fun `test redeemVoucher`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.redeemVoucher(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.RedeemVoucherRequest::class.java))
        }
        assertEquals("Reward", exception.domain)
    }
    @Test
    fun `test revokeVouchers`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.revokeVouchers(mock(java.util.UUID::class.java), null)
        }
        assertEquals("Reward", exception.domain)
    }
    @Test
    fun `test validateReward`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.validateReward(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.ValidateRewardRequest::class.java))
        }
        assertEquals("Reward", exception.domain)
    }
}
