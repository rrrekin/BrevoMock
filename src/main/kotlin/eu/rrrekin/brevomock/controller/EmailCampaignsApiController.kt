package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.EmailCampaignsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class EmailCampaignsApiController : EmailCampaignsApi {
    override fun createEmailCampaign(createEmailCampaignRequest: eu.rrrekin.brevo.model.CreateEmailCampaignRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateWebhook201Response> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun deleteEmailCampaign(campaignId: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun emailExportRecipients(campaignId: kotlin.Long, emailExportRecipientsRequest: eu.rrrekin.brevo.model.EmailExportRecipientsRequest?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ExportWebhooksHistory202Response> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun getAbTestCampaignResult(campaignId: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetAbTestCampaignResult200Response> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun getEmailCampaign(campaignId: kotlin.Long, statistics: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetEmailCampaign200Response> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun getEmailCampaigns(type: kotlin.String?, status: kotlin.String?, statistics: kotlin.String?, startDate: kotlin.String?, endDate: kotlin.String?, limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String, excludeHtmlContent: kotlin.Boolean?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetEmailCampaigns200Response> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun getSharedTemplateUrl(campaignId: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSharedTemplateUrl200Response> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun sendEmailCampaignNow(campaignId: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun sendReport(campaignId: kotlin.Long, sendReport: eu.rrrekin.brevo.model.SendReport): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun sendTestEmail(campaignId: kotlin.Long, sendTestEmail: eu.rrrekin.brevo.model.SendTestEmail): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun updateCampaignStatus(campaignId: kotlin.Long, updateCampaignStatus: eu.rrrekin.brevo.model.UpdateCampaignStatus): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun updateEmailCampaign(campaignId: kotlin.Long, updateEmailCampaignRequest: eu.rrrekin.brevo.model.UpdateEmailCampaignRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("EmailCampaigns")
    }
    override fun uploadImageToGallery(uploadImageToGalleryRequest: eu.rrrekin.brevo.model.UploadImageToGalleryRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.UploadImageToGallery201Response> {
        throw NotImplementedException("EmailCampaigns")
    }
}
