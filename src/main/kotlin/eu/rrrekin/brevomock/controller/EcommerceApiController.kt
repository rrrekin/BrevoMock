package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.EcommerceApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class EcommerceApiController : EcommerceApi {
    override fun createBatchOrder(createBatchOrderRequest: eu.rrrekin.brevo.model.CreateBatchOrderRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateBatchOrder202Response> {
        throw NotImplementedException("Ecommerce")
    }
    override fun createOrder(order: eu.rrrekin.brevo.model.Order): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Ecommerce")
    }
    override fun createProductAlert(id: kotlin.String, type: kotlin.String, createProductAlertRequest: eu.rrrekin.brevo.model.CreateProductAlertRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Ecommerce")
    }
    override fun createUpdateBatchCategory(createUpdateBatchCategoryRequest: eu.rrrekin.brevo.model.CreateUpdateBatchCategoryRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateUpdateBatchCategory201Response> {
        throw NotImplementedException("Ecommerce")
    }
    override fun createUpdateBatchProducts(createUpdateBatchProductsRequest: eu.rrrekin.brevo.model.CreateUpdateBatchProductsRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateUpdateBatchProducts201Response> {
        throw NotImplementedException("Ecommerce")
    }
    override fun createUpdateCategory(createUpdateCategoryRequest: eu.rrrekin.brevo.model.CreateUpdateCategoryRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateUpdateCategory201Response> {
        throw NotImplementedException("Ecommerce")
    }
    override fun createUpdateProduct(createUpdateProductRequest: eu.rrrekin.brevo.model.CreateUpdateProductRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateUpdateProduct201Response> {
        throw NotImplementedException("Ecommerce")
    }
    override fun ecommerceActivatePost(): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Ecommerce")
    }
    override fun ecommerceAttributionMetricsConversionSourceConversionSourceIdGet(conversionSource: kotlin.String, conversionSourceId: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.EcommerceAttributionMetricsConversionSourceConversionSourceIdGet200Response> {
        throw NotImplementedException("Ecommerce")
    }
    override fun ecommerceAttributionMetricsGet(periodFrom: java.time.OffsetDateTime?, periodTo: java.time.OffsetDateTime?, emailCampaignId: kotlin.collections.List<kotlin.String>?, smsCampaignId: kotlin.collections.List<kotlin.String>?, automationWorkflowEmailId: kotlin.collections.List<kotlin.String>?, automationWorkflowSmsId: kotlin.collections.List<kotlin.String>?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.EcommerceAttributionMetricsGet200Response> {
        throw NotImplementedException("Ecommerce")
    }
    override fun ecommerceAttributionProductsConversionSourceConversionSourceIdGet(conversionSource: kotlin.String, conversionSourceId: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.EcommerceAttributionProductsConversionSourceConversionSourceIdGet200Response> {
        throw NotImplementedException("Ecommerce")
    }
    override fun ecommerceConfigDisplayCurrencyGet(): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.EcommerceConfigDisplayCurrencyGet200Response> {
        throw NotImplementedException("Ecommerce")
    }
    override fun getCategories(limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String, ids: kotlin.collections.List<kotlin.String>?, name: kotlin.String?, modifiedSince: kotlin.String?, createdSince: kotlin.String?, isDeleted: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetCategories200Response> {
        throw NotImplementedException("Ecommerce")
    }
    override fun getCategoryInfo(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetCategoryDetails> {
        throw NotImplementedException("Ecommerce")
    }
    override fun getOrders(limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String, modifiedSince: kotlin.String?, createdSince: kotlin.String?): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Ecommerce")
    }
    override fun getProductInfo(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetProductDetails> {
        throw NotImplementedException("Ecommerce")
    }
    override fun getProducts(limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String, ids: kotlin.collections.List<kotlin.String>?, name: kotlin.String?, priceLte: java.math.BigDecimal?, priceGte: java.math.BigDecimal?, priceLt: java.math.BigDecimal?, priceGt: java.math.BigDecimal?, priceEq: java.math.BigDecimal?, priceNe: java.math.BigDecimal?, categories: kotlin.collections.List<kotlin.String>?, modifiedSince: kotlin.String?, createdSince: kotlin.String?, isDeleted: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetProducts200Response> {
        throw NotImplementedException("Ecommerce")
    }
    override fun setConfigDisplayCurrency(ecommerceConfigDisplayCurrencyGet200Response: eu.rrrekin.brevo.model.EcommerceConfigDisplayCurrencyGet200Response?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.EcommerceConfigDisplayCurrencyGet200Response> {
        throw NotImplementedException("Ecommerce")
    }
}
