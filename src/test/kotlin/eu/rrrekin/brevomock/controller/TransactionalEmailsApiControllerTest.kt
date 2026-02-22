package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class TransactionalEmailsApiControllerTest {
    private val controller = TransactionalEmailsApiController()
    @Test
    fun `test blockNewDomain`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.blockNewDomain(mock(eu.rrrekin.brevo.model.BlockNewDomainRequest::class.java))
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test createSmtpTemplate`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createSmtpTemplate(mock(eu.rrrekin.brevo.model.CreateSmtpTemplateRequest::class.java))
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test deleteBlockedDomain`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteBlockedDomain("test")
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test deleteHardbounces`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteHardbounces(null)
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test deleteScheduledEmailById`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteScheduledEmailById("test")
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test deleteSmtpTemplate`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteSmtpTemplate(1L)
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test getAggregatedSmtpReport`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getAggregatedSmtpReport(null, null, null, null)
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test getBlockedDomains`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getBlockedDomains()
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test getEmailEventReport`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getEmailEventReport(1L, 1L, null, null, null, null, null, null, null, null, "test")
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test getScheduledEmailById`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getScheduledEmailById("test", null, null, "test", null, 1L, 1L)
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test getSmtpReport`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSmtpReport(1L, 1L, null, null, null, null, "test")
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test getSmtpTemplate`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSmtpTemplate(1L)
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test getSmtpTemplates`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSmtpTemplates(null, 1L, 1L, "test")
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test getTransacBlockedContacts`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getTransacBlockedContacts(null, null, 1L, 1L, null, "test")
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test getTransacEmailContent`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getTransacEmailContent("test")
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test getTransacEmailsList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getTransacEmailsList(null, null, null, null, null, "test", 1L, 1L)
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test postPreviewSmtpEmailTemplates`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.postPreviewSmtpEmailTemplates(mock(eu.rrrekin.brevo.model.PostPreviewSmtpEmailTemplatesRequest::class.java))
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test sendTestTemplate`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendTestTemplate(1L, mock(eu.rrrekin.brevo.model.SendTestEmail::class.java))
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test sendTransacEmail`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.sendTransacEmail(mock(eu.rrrekin.brevo.model.SendTransacEmailRequest::class.java))
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test smtpBlockedContactsEmailDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.smtpBlockedContactsEmailDelete("test")
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test smtpLogIdentifierDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.smtpLogIdentifierDelete("test")
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
    @Test
    fun `test updateSmtpTemplate`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateSmtpTemplate(1L, mock(eu.rrrekin.brevo.model.UpdateSmtpTemplateRequest::class.java))
        }
        assertEquals("TransactionalEmails", exception.domain)
    }
}
