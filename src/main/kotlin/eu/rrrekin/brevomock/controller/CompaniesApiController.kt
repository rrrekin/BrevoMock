package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.CompaniesApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class CompaniesApiController : CompaniesApi {
    override fun companiesGet(filters: kotlin.String?, linkedContactsIds: kotlin.Long?, linkedDealsIds: kotlin.String?, modifiedSince: kotlin.String?, createdSince: kotlin.String?, page: kotlin.Long?, limit: kotlin.Long?, sort: kotlin.String?, sortBy: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CompaniesGet200Response> {
        throw NotImplementedException("Companies")
    }
    override fun companiesIdDelete(id: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Companies")
    }
    override fun companiesIdGet(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Company> {
        throw NotImplementedException("Companies")
    }
    override fun companiesIdPatch(id: kotlin.String, companiesIdPatchRequest: eu.rrrekin.brevo.model.CompaniesIdPatchRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Company> {
        throw NotImplementedException("Companies")
    }
    override fun companiesImportPost(file: org.springframework.web.multipart.MultipartFile?, mapping: kotlin.Any?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CompaniesImportPost200Response> {
        throw NotImplementedException("Companies")
    }
    override fun companiesLinkUnlinkIdPatch(id: kotlin.String, companiesLinkUnlinkIdPatchRequest: eu.rrrekin.brevo.model.CompaniesLinkUnlinkIdPatchRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Companies")
    }
    override fun companiesPost(companiesPostRequest: eu.rrrekin.brevo.model.CompaniesPostRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CompaniesPost200Response> {
        throw NotImplementedException("Companies")
    }
    override fun crmAttributesCompaniesGet(): org.springframework.http.ResponseEntity<kotlin.collections.List<eu.rrrekin.brevo.model.CrmAttributesCompaniesGet200ResponseInner>> {
        throw NotImplementedException("Companies")
    }
    override fun crmAttributesIdDelete(id: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Companies")
    }
    override fun crmAttributesIdPatch(id: kotlin.String, crmAttributesIdPatchRequest: eu.rrrekin.brevo.model.CrmAttributesIdPatchRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Companies")
    }
    override fun crmAttributesPost(crmAttributesPostRequest: eu.rrrekin.brevo.model.CrmAttributesPostRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CrmAttributesPost200Response> {
        throw NotImplementedException("Companies")
    }
}
