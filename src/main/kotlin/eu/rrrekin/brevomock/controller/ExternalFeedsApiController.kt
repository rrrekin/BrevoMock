package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.ExternalFeedsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class ExternalFeedsApiController : ExternalFeedsApi {
    override fun createExternalFeed(createExternalFeedRequest: eu.rrrekin.brevo.model.CreateExternalFeedRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateExternalFeed201Response> {
        throw NotImplementedException("ExternalFeeds")
    }
    override fun deleteExternalFeed(uuid: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("ExternalFeeds")
    }
    override fun getAllExternalFeeds(search: kotlin.String?, startDate: java.time.LocalDate?, endDate: java.time.LocalDate?, sort: kotlin.String, authType: kotlin.String?, limit: kotlin.Long, offset: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetAllExternalFeeds200Response> {
        throw NotImplementedException("ExternalFeeds")
    }
    override fun getExternalFeedByUUID(uuid: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetExternalFeedByUUID200Response> {
        throw NotImplementedException("ExternalFeeds")
    }
    override fun updateExternalFeed(uuid: kotlin.String, updateExternalFeedRequest: eu.rrrekin.brevo.model.UpdateExternalFeedRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("ExternalFeeds")
    }
}
