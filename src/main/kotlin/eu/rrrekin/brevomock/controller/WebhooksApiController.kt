package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.WebhooksApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class WebhooksApiController : WebhooksApi {
    override fun createWebhook(createWebhookRequest: eu.rrrekin.brevo.model.CreateWebhookRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateWebhook201Response> {
        throw NotImplementedException("Webhooks")
    }
    override fun deleteWebhook(webhookId: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Webhooks")
    }
    override fun exportWebhooksHistory(exportWebhooksHistoryRequest: eu.rrrekin.brevo.model.ExportWebhooksHistoryRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ExportWebhooksHistory202Response> {
        throw NotImplementedException("Webhooks")
    }
    override fun getWebhook(webhookId: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetWebhook> {
        throw NotImplementedException("Webhooks")
    }
    override fun getWebhooks(type: kotlin.String, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetWebhooks200Response> {
        throw NotImplementedException("Webhooks")
    }
    override fun updateWebhook(webhookId: kotlin.Long, updateWebhook: eu.rrrekin.brevo.model.UpdateWebhookRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Webhooks")
    }
}
