package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.DomainsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class DomainsApiController : DomainsApi {
    override fun authenticateDomain(domainName: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.AuthenticateDomain200Response> {
        throw NotImplementedException("Domains")
    }
    override fun createDomain(domain: eu.rrrekin.brevo.model.CreateDomainRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateDomain200Response> {
        throw NotImplementedException("Domains")
    }
    override fun deleteDomain(domainName: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Domains")
    }
    override fun getDomainConfiguration(domainName: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetDomainConfiguration200Response> {
        throw NotImplementedException("Domains")
    }
    override fun getDomains(): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetDomains200Response> {
        throw NotImplementedException("Domains")
    }
}
