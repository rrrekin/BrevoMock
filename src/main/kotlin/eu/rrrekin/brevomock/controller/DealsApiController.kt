package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.DealsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class DealsApiController : DealsApi {
    override fun crmAttributesDealsGet(): org.springframework.http.ResponseEntity<kotlin.collections.List<eu.rrrekin.brevo.model.CrmAttributesDealsGet200ResponseInner>> {
        throw NotImplementedException("Deals")
    }
    override fun crmDealsGet(filtersAttributesDealName: kotlin.String?, filtersLinkedCompaniesIds: kotlin.String?, filtersLinkedContactsIds: kotlin.String?, modifiedSince: kotlin.String?, createdSince: kotlin.String?, offset: kotlin.Long?, limit: kotlin.Long?, sort: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CrmDealsGet200Response> {
        throw NotImplementedException("Deals")
    }
    override fun crmDealsIdDelete(id: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Deals")
    }
    override fun crmDealsIdGet(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Deal> {
        throw NotImplementedException("Deals")
    }
    override fun crmDealsIdPatch(id: kotlin.String, crmDealsIdPatchRequest: eu.rrrekin.brevo.model.CrmDealsIdPatchRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Deals")
    }
    override fun crmDealsImportPost(file: org.springframework.web.multipart.MultipartFile?, mapping: kotlin.Any?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CompaniesImportPost200Response> {
        throw NotImplementedException("Deals")
    }
    override fun crmDealsLinkUnlinkIdPatch(id: kotlin.String, crmDealsLinkUnlinkIdPatchRequest: eu.rrrekin.brevo.model.CrmDealsLinkUnlinkIdPatchRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Deals")
    }
    override fun crmDealsPost(crmDealsPostRequest: eu.rrrekin.brevo.model.CrmDealsPostRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CrmDealsPost201Response> {
        throw NotImplementedException("Deals")
    }
    override fun crmPipelineDetailsAllGet(): org.springframework.http.ResponseEntity<kotlin.collections.List<eu.rrrekin.brevo.model.Pipeline>> {
        throw NotImplementedException("Deals")
    }
    override fun crmPipelineDetailsGet(): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Pipeline> {
        throw NotImplementedException("Deals")
    }
    override fun crmPipelineDetailsPipelineIDGet(pipelineID: kotlin.String): org.springframework.http.ResponseEntity<kotlin.collections.List<eu.rrrekin.brevo.model.Pipeline>> {
        throw NotImplementedException("Deals")
    }
}
