package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class WebhooksApiControllerTest {
    private val controller = WebhooksApiController()
    @Test
    fun `test createWebhook`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createWebhook(mock(eu.rrrekin.brevo.model.CreateWebhookRequest::class.java))
        }
        assertEquals("Webhooks", exception.domain)
    }
    @Test
    fun `test deleteWebhook`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteWebhook(1L)
        }
        assertEquals("Webhooks", exception.domain)
    }
    @Test
    fun `test exportWebhooksHistory`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.exportWebhooksHistory(mock(eu.rrrekin.brevo.model.ExportWebhooksHistoryRequest::class.java))
        }
        assertEquals("Webhooks", exception.domain)
    }
    @Test
    fun `test getWebhook`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getWebhook(1L)
        }
        assertEquals("Webhooks", exception.domain)
    }
    @Test
    fun `test getWebhooks`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getWebhooks("test", "test")
        }
        assertEquals("Webhooks", exception.domain)
    }
    @Test
    fun `test updateWebhook`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateWebhook(1L, mock(eu.rrrekin.brevo.model.UpdateWebhookRequest::class.java))
        }
        assertEquals("Webhooks", exception.domain)
    }
}
