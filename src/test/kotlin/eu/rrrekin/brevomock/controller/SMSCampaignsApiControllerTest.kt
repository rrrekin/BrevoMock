package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class SMSCampaignsApiControllerTest {
    private val controller = SMSCampaignsApiController()
    @Test
    fun `test createSmsCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createSmsCampaign(mock(eu.rrrekin.brevo.model.CreateSmsCampaignRequest::class.java))
        }
        assertEquals("SMSCampaigns", exception.domain)
    }
    @Test
    fun `test deleteSmsCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteSmsCampaign(1L)
        }
        assertEquals("SMSCampaigns", exception.domain)
    }
    @Test
    fun `test getSmsCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSmsCampaign(1L)
        }
        assertEquals("SMSCampaigns", exception.domain)
    }
    @Test
    fun `test getSmsCampaigns`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSmsCampaigns(null, null, null, 1L, 1L, "test")
        }
        assertEquals("SMSCampaigns", exception.domain)
    }
    @Test
    fun `test requestSmsRecipientExport`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.requestSmsRecipientExport(1L, null)
        }
        assertEquals("SMSCampaigns", exception.domain)
    }
    @Test
    fun `test sendSmsCampaignNow`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendSmsCampaignNow(1L)
        }
        assertEquals("SMSCampaigns", exception.domain)
    }
    @Test
    fun `test sendSmsReport`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendSmsReport(1L, mock(eu.rrrekin.brevo.model.SendReport::class.java))
        }
        assertEquals("SMSCampaigns", exception.domain)
    }
    @Test
    fun `test sendTestSms`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendTestSms(1L, mock(eu.rrrekin.brevo.model.SendTestSmsRequest::class.java))
        }
        assertEquals("SMSCampaigns", exception.domain)
    }
    @Test
    fun `test updateSmsCampaign`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateSmsCampaign(1L, mock(eu.rrrekin.brevo.model.UpdateSmsCampaignRequest::class.java))
        }
        assertEquals("SMSCampaigns", exception.domain)
    }
    @Test
    fun `test updateSmsCampaignStatus`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateSmsCampaignStatus(1L, mock(eu.rrrekin.brevo.model.UpdateCampaignStatus::class.java))
        }
        assertEquals("SMSCampaigns", exception.domain)
    }
}
