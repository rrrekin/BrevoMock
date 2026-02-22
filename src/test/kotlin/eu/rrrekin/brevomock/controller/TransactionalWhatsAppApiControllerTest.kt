package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class TransactionalWhatsAppApiControllerTest {
    private val controller = TransactionalWhatsAppApiController()
    @Test
    fun `test getWhatsappEventReport`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getWhatsappEventReport(1L, 1L, null, null, null, null, null, "test")
        }
        assertEquals("TransactionalWhatsApp", exception.domain)
    }
    @Test
    fun `test sendWhatsappMessage`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendWhatsappMessage(mock(eu.rrrekin.brevo.model.SendWhatsappMessageRequest::class.java))
        }
        assertEquals("TransactionalWhatsApp", exception.domain)
    }
}
