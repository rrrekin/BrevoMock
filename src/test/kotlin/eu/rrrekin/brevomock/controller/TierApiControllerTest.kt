package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class TierApiControllerTest {
    private val controller = TierApiController()
    @Test
    fun `test addSubscriptionToTier`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.addSubscriptionToTier(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), mock(java.util.UUID::class.java))
        }
        assertEquals("Tier", exception.domain)
    }
    @Test
    fun `test createTierForTierGroup`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createTierForTierGroup(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.CreateTierForTierGroupRequest::class.java))
        }
        assertEquals("Tier", exception.domain)
    }
    @Test
    fun `test createTierGroup`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createTierGroup(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.CreateTierGroupRequest::class.java))
        }
        assertEquals("Tier", exception.domain)
    }
    @Test
    fun `test deleteTier`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteTier(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java))
        }
        assertEquals("Tier", exception.domain)
    }
    @Test
    fun `test deleteTierGroup`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteTierGroup(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java))
        }
        assertEquals("Tier", exception.domain)
    }
    @Test
    fun `test getListOfTierGroups`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getListOfTierGroups(mock(java.util.UUID::class.java), "test")
        }
        assertEquals("Tier", exception.domain)
    }
    @Test
    fun `test getLoyaltyProgramTier`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getLoyaltyProgramTier(mock(java.util.UUID::class.java), "test")
        }
        assertEquals("Tier", exception.domain)
    }
    @Test
    fun `test getTierGroup`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getTierGroup(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), "test")
        }
        assertEquals("Tier", exception.domain)
    }
    @Test
    fun `test updateTier`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateTier(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.UpdateTierRequest::class.java))
        }
        assertEquals("Tier", exception.domain)
    }
    @Test
    fun `test updateTierGroup`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateTierGroup(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.UpdateTierGroupRequest::class.java))
        }
        assertEquals("Tier", exception.domain)
    }
}
