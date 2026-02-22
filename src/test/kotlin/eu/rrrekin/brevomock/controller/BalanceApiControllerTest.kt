package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class BalanceApiControllerTest {
    private val controller = BalanceApiController()
    @Test
    fun `test beginTransaction`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.beginTransaction(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.BeginTransactionRequest::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test cancelTransaction`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.cancelTransaction(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test completeTransaction`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.completeTransaction(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test createBalanceLimit`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createBalanceLimit(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.CreateBalanceLimitRequest::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test createBalanceOrder`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createBalanceOrder(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.CreateBalanceOrderRequest::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test deleteBalanceDefinition`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteBalanceDefinition(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test deleteBalanceLimit`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteBalanceLimit(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), mock(java.util.UUID::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test getBalanceDefinition`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getBalanceDefinition(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), "test")
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test getBalanceDefinitionList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getBalanceDefinitionList(mock(java.util.UUID::class.java), 1, 1, "test", "test", "test")
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test getBalanceLimit`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getBalanceLimit(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), "test")
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test getContactBalances`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getContactBalances(mock(java.util.UUID::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test getSubscriptionBalances`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSubscriptionBalances("test", mock(java.util.UUID::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test loyaltyBalanceProgramsPidActiveBalanceGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.loyaltyBalanceProgramsPidActiveBalanceGet(mock(java.util.UUID::class.java), 1, mock(java.util.UUID::class.java), null, null, null, null)
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test loyaltyBalanceProgramsPidBalanceDefinitionsPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.loyaltyBalanceProgramsPidBalanceDefinitionsPost(mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.LoyaltyBalanceProgramsPidBalanceDefinitionsPostRequest::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test loyaltyBalanceProgramsPidSubscriptionsCidBalancesPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.loyaltyBalanceProgramsPidSubscriptionsCidBalancesPost(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.LoyaltyBalanceProgramsPidSubscriptionsCidBalancesPostRequest::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test loyaltyBalanceProgramsPidTransactionHistoryGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.loyaltyBalanceProgramsPidTransactionHistoryGet(mock(java.util.UUID::class.java), 1, mock(java.util.UUID::class.java), 1, 1, "test", "test", null)
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test updateBalanceDefinition`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateBalanceDefinition(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.UpdateBalanceDefinitionRequest::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
    @Test
    fun `test updateBalanceLimit`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateBalanceLimit(mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), mock(java.util.UUID::class.java), mock(eu.rrrekin.brevo.model.UpdateBalanceLimitRequest::class.java))
        }
        assertEquals("Balance", exception.domain)
    }
}
