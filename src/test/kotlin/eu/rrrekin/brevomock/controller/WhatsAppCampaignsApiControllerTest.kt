package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class WhatsAppCampaignsApiControllerTest {
    private val controller = WhatsAppCampaignsApiController()
    @Test
    fun `test createWhatsAppCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createWhatsAppCampaign(mock(eu.rrrekin.brevo.model.CreateWhatsAppCampaignRequest::class.java))
        }
        assertEquals("WhatsAppCampaigns", exception.domain)
    }
    @Test
    fun `test createWhatsAppTemplate`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createWhatsAppTemplate(mock(eu.rrrekin.brevo.model.CreateWhatsAppTemplateRequest::class.java))
        }
        assertEquals("WhatsAppCampaigns", exception.domain)
    }
    @Test
    fun `test deleteWhatsAppCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteWhatsAppCampaign(1L)
        }
        assertEquals("WhatsAppCampaigns", exception.domain)
    }
    @Test
    fun `test getWhatsAppCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getWhatsAppCampaign(1L)
        }
        assertEquals("WhatsAppCampaigns", exception.domain)
    }
    @Test
    fun `test getWhatsAppCampaigns`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getWhatsAppCampaigns(null, null, 1L, 1L, "test")
        }
        assertEquals("WhatsAppCampaigns", exception.domain)
    }
    @Test
    fun `test getWhatsAppConfig`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getWhatsAppConfig()
        }
        assertEquals("WhatsAppCampaigns", exception.domain)
    }
    @Test
    fun `test getWhatsAppTemplates`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getWhatsAppTemplates(null, null, 1L, 1L, "test", null)
        }
        assertEquals("WhatsAppCampaigns", exception.domain)
    }
    @Test
    fun `test sendWhatsAppTemplateApproval`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendWhatsAppTemplateApproval(1L)
        }
        assertEquals("WhatsAppCampaigns", exception.domain)
    }
    @Test
    fun `test updateWhatsAppCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateWhatsAppCampaign(1L, mock(eu.rrrekin.brevo.model.UpdateWhatsAppCampaignRequest::class.java))
        }
        assertEquals("WhatsAppCampaigns", exception.domain)
    }
}
