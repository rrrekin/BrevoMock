package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class AccountApiControllerTest {
    private val controller = AccountApiController()
    @Test
    fun `test getAccount`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getAccount()
        }
        assertEquals("Account", exception.domain)
    }
    @Test
    fun `test getAccountActivity`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getAccountActivity(null, null, null, 1L, 1L)
        }
        assertEquals("Account", exception.domain)
    }
}
