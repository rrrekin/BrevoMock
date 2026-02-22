package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class EmailCampaignsApiControllerTest {
    private val controller = EmailCampaignsApiController()
    @Test
    fun `test createEmailCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createEmailCampaign(mock(eu.rrrekin.brevo.model.CreateEmailCampaignRequest::class.java))
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test deleteEmailCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteEmailCampaign(1L)
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test emailExportRecipients`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.emailExportRecipients(1L, null)
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test getAbTestCampaignResult`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getAbTestCampaignResult(1L)
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test getEmailCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getEmailCampaign(1L, null)
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test getEmailCampaigns`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getEmailCampaigns(null, null, null, null, null, 1L, 1L, "test", null)
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test getSharedTemplateUrl`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSharedTemplateUrl(1L)
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test sendEmailCampaignNow`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendEmailCampaignNow(1L)
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test sendReport`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendReport(1L, mock(eu.rrrekin.brevo.model.SendReport::class.java))
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test sendTestEmail`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendTestEmail(1L, mock(eu.rrrekin.brevo.model.SendTestEmail::class.java))
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test updateCampaignStatus`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateCampaignStatus(1L, mock(eu.rrrekin.brevo.model.UpdateCampaignStatus::class.java))
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test updateEmailCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateEmailCampaign(1L, mock(eu.rrrekin.brevo.model.UpdateEmailCampaignRequest::class.java))
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
    @Test
    fun `test uploadImageToGallery`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.uploadImageToGallery(mock(eu.rrrekin.brevo.model.UploadImageToGalleryRequest::class.java))
        }
        assertEquals("EmailCampaigns", exception.domain)
    }
}
