package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.SMSCampaignsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class SMSCampaignsApiController : SMSCampaignsApi {
    override fun createSmsCampaign(createSmsCampaignRequest: eu.rrrekin.brevo.model.CreateSmsCampaignRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateWebhook201Response> {
        throw NotImplementedException("SMSCampaigns")
    }
    override fun deleteSmsCampaign(campaignId: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("SMSCampaigns")
    }
    override fun getSmsCampaign(campaignId: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSmsCampaign200Response> {
        throw NotImplementedException("SMSCampaigns")
    }
    override fun getSmsCampaigns(status: kotlin.String?, startDate: kotlin.String?, endDate: kotlin.String?, limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSmsCampaigns200Response> {
        throw NotImplementedException("SMSCampaigns")
    }
    override fun requestSmsRecipientExport(campaignId: kotlin.Long, recipientExport: eu.rrrekin.brevo.model.RequestSmsRecipientExportRequest?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ExportWebhooksHistory202Response> {
        throw NotImplementedException("SMSCampaigns")
    }
    override fun sendSmsCampaignNow(campaignId: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("SMSCampaigns")
    }
    override fun sendSmsReport(campaignId: kotlin.Long, sendReport: eu.rrrekin.brevo.model.SendReport): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("SMSCampaigns")
    }
    override fun sendTestSms(campaignId: kotlin.Long, sendTestSmsRequest: eu.rrrekin.brevo.model.SendTestSmsRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("SMSCampaigns")
    }
    override fun updateSmsCampaign(campaignId: kotlin.Long, updateSmsCampaignRequest: eu.rrrekin.brevo.model.UpdateSmsCampaignRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("SMSCampaigns")
    }
    override fun updateSmsCampaignStatus(campaignId: kotlin.Long, status: eu.rrrekin.brevo.model.UpdateCampaignStatus): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("SMSCampaigns")
    }
}
