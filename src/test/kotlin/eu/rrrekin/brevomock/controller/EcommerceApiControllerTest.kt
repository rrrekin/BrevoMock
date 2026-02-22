package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class EcommerceApiControllerTest {
    private val controller = EcommerceApiController()
    @Test
    fun `test createBatchOrder`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createBatchOrder(mock(eu.rrrekin.brevo.model.CreateBatchOrderRequest::class.java))
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test createOrder`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createOrder(mock(eu.rrrekin.brevo.model.Order::class.java))
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test createProductAlert`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createProductAlert("test", "test", mock(eu.rrrekin.brevo.model.CreateProductAlertRequest::class.java))
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test createUpdateBatchCategory`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createUpdateBatchCategory(mock(eu.rrrekin.brevo.model.CreateUpdateBatchCategoryRequest::class.java))
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test createUpdateBatchProducts`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createUpdateBatchProducts(mock(eu.rrrekin.brevo.model.CreateUpdateBatchProductsRequest::class.java))
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test createUpdateCategory`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createUpdateCategory(mock(eu.rrrekin.brevo.model.CreateUpdateCategoryRequest::class.java))
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test createUpdateProduct`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createUpdateProduct(mock(eu.rrrekin.brevo.model.CreateUpdateProductRequest::class.java))
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test ecommerceActivatePost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.ecommerceActivatePost()
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test ecommerceAttributionMetricsConversionSourceConversionSourceIdGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.ecommerceAttributionMetricsConversionSourceConversionSourceIdGet("test", "test")
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test ecommerceAttributionMetricsGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.ecommerceAttributionMetricsGet(null, null, null, null, null, null)
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test ecommerceAttributionProductsConversionSourceConversionSourceIdGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.ecommerceAttributionProductsConversionSourceConversionSourceIdGet("test", "test")
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test ecommerceConfigDisplayCurrencyGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.ecommerceConfigDisplayCurrencyGet()
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test getCategories`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getCategories(1L, 1L, "test", null, null, null, null, null)
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test getCategoryInfo`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getCategoryInfo("test")
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test getOrders`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getOrders(1L, 1L, "test", null, null)
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test getProductInfo`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getProductInfo("test")
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test getProducts`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getProducts(1L, 1L, "test", null, null, null, null, null, null, null, null, null, null, null, null)
        }
        assertEquals("Ecommerce", exception.domain)
    }
    @Test
    fun `test setConfigDisplayCurrency`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.setConfigDisplayCurrency(null)
        }
        assertEquals("Ecommerce", exception.domain)
    }
}
