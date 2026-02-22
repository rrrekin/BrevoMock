package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class CouponsApiControllerTest {
    private val controller = CouponsApiController()
    @Test
    fun `test createCouponCollection`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createCouponCollection(mock(eu.rrrekin.brevo.model.CreateCouponCollectionRequest::class.java))
        }
        assertEquals("Coupons", exception.domain)
    }
    @Test
    fun `test createCoupons`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createCoupons(mock(eu.rrrekin.brevo.model.CreateCouponsRequest::class.java))
        }
        assertEquals("Coupons", exception.domain)
    }
    @Test
    fun `test getCouponCollection`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getCouponCollection("test")
        }
        assertEquals("Coupons", exception.domain)
    }
    @Test
    fun `test getCouponCollections`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getCouponCollections(1L, 1L, "test", "test")
        }
        assertEquals("Coupons", exception.domain)
    }
    @Test
    fun `test updateCouponCollection`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateCouponCollection("test", null)
        }
        assertEquals("Coupons", exception.domain)
    }
}
