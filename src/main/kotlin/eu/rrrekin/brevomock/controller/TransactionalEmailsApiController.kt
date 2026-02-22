package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.TransactionalEmailsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class TransactionalEmailsApiController : TransactionalEmailsApi {
    override fun blockNewDomain(blockNewDomainRequest: eu.rrrekin.brevo.model.BlockNewDomainRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun createSmtpTemplate(createSmtpTemplateRequest: eu.rrrekin.brevo.model.CreateSmtpTemplateRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateWebhook201Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun deleteBlockedDomain(domain: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun deleteHardbounces(deleteHardbouncesRequest: eu.rrrekin.brevo.model.DeleteHardbouncesRequest?): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun deleteScheduledEmailById(identifier: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun deleteSmtpTemplate(templateId: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun getAggregatedSmtpReport(startDate: kotlin.String?, endDate: kotlin.String?, days: kotlin.Long?, tag: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetAggregatedSmtpReport200Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun getBlockedDomains(): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetBlockedDomains200Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun getEmailEventReport(limit: kotlin.Long, offset: kotlin.Long, startDate: kotlin.String?, endDate: kotlin.String?, days: kotlin.Long?, email: kotlin.String?, event: kotlin.String?, tags: kotlin.String?, messageId: kotlin.String?, templateId: kotlin.Long?, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetEmailEventReport200Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun getScheduledEmailById(identifier: kotlin.String, startDate: java.time.LocalDate?, endDate: java.time.LocalDate?, sort: kotlin.String, status: kotlin.String?, limit: kotlin.Long, offset: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetScheduledEmailById200Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun getSmtpReport(limit: kotlin.Long, offset: kotlin.Long, startDate: kotlin.String?, endDate: kotlin.String?, days: kotlin.Long?, tag: kotlin.String?, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSmtpReport200Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun getSmtpTemplate(templateId: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSmtpTemplateOverview> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun getSmtpTemplates(templateStatus: kotlin.Boolean?, limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSmtpTemplates200Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun getTransacBlockedContacts(startDate: kotlin.String?, endDate: kotlin.String?, limit: kotlin.Long, offset: kotlin.Long, senders: kotlin.collections.List<kotlin.String>?, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetTransacBlockedContacts200Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun getTransacEmailContent(uuid: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetTransacEmailContent200Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun getTransacEmailsList(email: kotlin.String?, templateId: kotlin.Long?, messageId: kotlin.String?, startDate: kotlin.String?, endDate: kotlin.String?, sort: kotlin.String, limit: kotlin.Long, offset: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetTransacEmailsList200Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun postPreviewSmtpEmailTemplates(postPreviewSmtpEmailTemplatesRequest: eu.rrrekin.brevo.model.PostPreviewSmtpEmailTemplatesRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.PostPreviewSmtpEmailTemplates200Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun sendTestTemplate(templateId: kotlin.Long, sendTestEmail: eu.rrrekin.brevo.model.SendTestEmail): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun sendTransacEmail(sendTransacEmailRequest: eu.rrrekin.brevo.model.SendTransacEmailRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.SendTransacEmail201Response> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun smtpBlockedContactsEmailDelete(email: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun smtpLogIdentifierDelete(identifier: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("TransactionalEmails")
    }
    override fun updateSmtpTemplate(templateId: kotlin.Long, updateSmtpTemplateRequest: eu.rrrekin.brevo.model.UpdateSmtpTemplateRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("TransactionalEmails")
    }
}
