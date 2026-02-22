package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class ProgramApiControllerTest {
    private val controller = ProgramApiController()
    @Test
    fun `test createNewLP`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createNewLP(mock(eu.rrrekin.brevo.model.CreateNewLPRequest::class.java))
        }
        assertEquals("Program", exception.domain)
    }
    @Test
    fun `test deleteContactMembers`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteContactMembers(mock(java.util.UUID::class.java), "test")
        }
        assertEquals("Program", exception.domain)
    }
    @Test
    fun `test deleteLoyaltyProgram`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteLoyaltyProgram(mock(java.util.UUID::class.java))
        }
        assertEquals("Program", exception.domain)
    }
    @Test
    fun `test getLPList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getLPList(null, null, null, null)
        }
        assertEquals("Program", exception.domain)
    }
    @Test
    fun `test getLoyaltyProgramInfo`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getLoyaltyProgramInfo(mock(java.util.UUID::class.java))
        }
        assertEquals("Program", exception.domain)
    }
    @Test
    fun `test getParameterSubscriptionInfo`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getParameterSubscriptionInfo(mock(java.util.UUID::class.java), null, null, null)
        }
        assertEquals("Program", exception.domain)
    }
    @Test
    fun `test partiallyUpdateLoyaltyProgram`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.partiallyUpdateLoyaltyProgram(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.PartiallyUpdateLoyaltyProgramRequest::class.java))
        }
        assertEquals("Program", exception.domain)
    }
    @Test
    fun `test publishLoyaltyProgram`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.publishLoyaltyProgram(mock(java.util.UUID::class.java))
        }
        assertEquals("Program", exception.domain)
    }
    @Test
    fun `test subscribeMemberToASubscription`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.subscribeMemberToASubscription(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.SubscribeMemberToASubscriptionRequest::class.java))
        }
        assertEquals("Program", exception.domain)
    }
    @Test
    fun `test subscribeToLoyaltyProgram`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.subscribeToLoyaltyProgram(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.SubscribeToLoyaltyProgramRequest::class.java))
        }
        assertEquals("Program", exception.domain)
    }
    @Test
    fun `test updateLoyaltyProgram`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateLoyaltyProgram(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.UpdateLoyaltyProgramRequest::class.java))
        }
        assertEquals("Program", exception.domain)
    }
}
