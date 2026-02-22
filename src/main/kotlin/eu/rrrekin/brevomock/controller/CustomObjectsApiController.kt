package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.CustomObjectsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomObjectsApiController : CustomObjectsApi {
    override fun batchDeleteObjectRecords(objectType: kotlin.String, batchDeleteObjectRecordsRequest: eu.rrrekin.brevo.model.BatchDeleteObjectRecordsRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.BatchDeleteObjectRecords202Response> {
        throw NotImplementedException("CustomObjects")
    }
    override fun getrecords(objectType: kotlin.String, limit: kotlin.Long, pageNum: kotlin.Long, sort: kotlin.String, association: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Getrecords200Response> {
        throw NotImplementedException("CustomObjects")
    }
    override fun upsertrecords(objectType: kotlin.String, upsertrecordsRequest: eu.rrrekin.brevo.model.UpsertrecordsRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Upsertrecords202Response> {
        throw NotImplementedException("CustomObjects")
    }
}
