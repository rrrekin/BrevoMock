package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class TransactionalSMSApiControllerTest {
    private val controller = TransactionalSMSApiController()
    @Test
    fun `test getSmsEvents`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSmsEvents(1L, null, null, 1L, null, null, null, null, "test")
        }
        assertEquals("TransactionalSMS", exception.domain)
    }
    @Test
    fun `test getTransacAggregatedSmsReport`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getTransacAggregatedSmsReport(null, null, null, null)
        }
        assertEquals("TransactionalSMS", exception.domain)
    }
    @Test
    fun `test getTransacSmsReport`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getTransacSmsReport(null, null, null, null, "test")
        }
        assertEquals("TransactionalSMS", exception.domain)
    }
    @Test
    fun `test sendAsyncTransactionalSms`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendAsyncTransactionalSms(mock(eu.rrrekin.brevo.model.SendTransacSms::class.java))
        }
        assertEquals("TransactionalSMS", exception.domain)
    }
    @Test
    fun `test sendTransacSms`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendTransacSms(mock(eu.rrrekin.brevo.model.SendTransacSms::class.java))
        }
        assertEquals("TransactionalSMS", exception.domain)
    }
}
