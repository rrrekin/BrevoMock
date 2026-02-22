package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class PaymentsApiControllerTest {
    private val controller = PaymentsApiController()
    @Test
    fun `test createPaymentRequest`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createPaymentRequest(mock(eu.rrrekin.brevo.model.CreatePaymentRequestRequest::class.java))
        }
        assertEquals("Payments", exception.domain)
    }
    @Test
    fun `test deletePaymentRequest`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deletePaymentRequest(mock(java.util.UUID::class.java))
        }
        assertEquals("Payments", exception.domain)
    }
    @Test
    fun `test getPaymentRequest`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getPaymentRequest("test")
        }
        assertEquals("Payments", exception.domain)
    }
}
