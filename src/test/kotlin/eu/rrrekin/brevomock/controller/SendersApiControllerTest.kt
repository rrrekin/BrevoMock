package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class SendersApiControllerTest {
    private val controller = SendersApiController()
    @Test
    fun `test createSender`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createSender(mock(eu.rrrekin.brevo.model.CreateSenderRequest::class.java))
        }
        assertEquals("Senders", exception.domain)
    }
    @Test
    fun `test deleteSender`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteSender(1L)
        }
        assertEquals("Senders", exception.domain)
    }
    @Test
    fun `test getIps`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getIps()
        }
        assertEquals("Senders", exception.domain)
    }
    @Test
    fun `test getIpsFromSender`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getIpsFromSender(1L)
        }
        assertEquals("Senders", exception.domain)
    }
    @Test
    fun `test getSenders`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSenders(null, null)
        }
        assertEquals("Senders", exception.domain)
    }
    @Test
    fun `test updateSender`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateSender(1L, null)
        }
        assertEquals("Senders", exception.domain)
    }
    @Test
    fun `test validateSenderByOTP`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.validateSenderByOTP(1L, mock(eu.rrrekin.brevo.model.ValidateSenderByOTPRequest::class.java))
        }
        assertEquals("Senders", exception.domain)
    }
}
