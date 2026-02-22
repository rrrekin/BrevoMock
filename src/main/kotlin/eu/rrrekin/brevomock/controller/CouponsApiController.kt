package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.CouponsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class CouponsApiController : CouponsApi {
    override fun createCouponCollection(createCouponCollectionRequest: eu.rrrekin.brevo.model.CreateCouponCollectionRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateCouponCollection201Response> {
        throw NotImplementedException("Coupons")
    }
    override fun createCoupons(createCouponsRequest: eu.rrrekin.brevo.model.CreateCouponsRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Coupons")
    }
    override fun getCouponCollection(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetCouponCollection> {
        throw NotImplementedException("Coupons")
    }
    override fun getCouponCollections(limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String, sortBy: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetCouponCollection> {
        throw NotImplementedException("Coupons")
    }
    override fun updateCouponCollection(id: kotlin.String, updateCouponCollectionRequest: eu.rrrekin.brevo.model.UpdateCouponCollectionRequest?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.UpdateCouponCollection200Response> {
        throw NotImplementedException("Coupons")
    }
}
