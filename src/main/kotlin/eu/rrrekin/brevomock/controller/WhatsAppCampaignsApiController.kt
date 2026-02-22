package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.WhatsAppCampaignsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class WhatsAppCampaignsApiController : WhatsAppCampaignsApi {
    override fun createWhatsAppCampaign(createWhatsAppCampaignRequest: eu.rrrekin.brevo.model.CreateWhatsAppCampaignRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateWebhook201Response> {
        throw NotImplementedException("WhatsAppCampaigns")
    }
    override fun createWhatsAppTemplate(createWhatsAppTemplateRequest: eu.rrrekin.brevo.model.CreateWhatsAppTemplateRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateWebhook201Response> {
        throw NotImplementedException("WhatsAppCampaigns")
    }
    override fun deleteWhatsAppCampaign(campaignId: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("WhatsAppCampaigns")
    }
    override fun getWhatsAppCampaign(campaignId: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetWhatsAppCampaign200Response> {
        throw NotImplementedException("WhatsAppCampaigns")
    }
    override fun getWhatsAppCampaigns(startDate: kotlin.String?, endDate: kotlin.String?, limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetWhatsAppCampaigns200Response> {
        throw NotImplementedException("WhatsAppCampaigns")
    }
    override fun getWhatsAppConfig(): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetWhatsAppConfig200Response> {
        throw NotImplementedException("WhatsAppCampaigns")
    }
    override fun getWhatsAppTemplates(startDate: kotlin.String?, endDate: kotlin.String?, limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String, source: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetWhatsAppTemplates200Response> {
        throw NotImplementedException("WhatsAppCampaigns")
    }
    override fun sendWhatsAppTemplateApproval(templateId: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("WhatsAppCampaigns")
    }
    override fun updateWhatsAppCampaign(campaignId: kotlin.Long, updateWhatsAppCampaignRequest: eu.rrrekin.brevo.model.UpdateWhatsAppCampaignRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("WhatsAppCampaigns")
    }
}
