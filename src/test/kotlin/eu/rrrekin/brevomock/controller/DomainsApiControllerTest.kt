package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class DomainsApiControllerTest {
    private val controller = DomainsApiController()
    @Test
    fun `test authenticateDomain`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.authenticateDomain("test")
        }
        assertEquals("Domains", exception.domain)
    }
    @Test
    fun `test createDomain`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createDomain(mock(eu.rrrekin.brevo.model.CreateDomainRequest::class.java))
        }
        assertEquals("Domains", exception.domain)
    }
    @Test
    fun `test deleteDomain`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteDomain("test")
        }
        assertEquals("Domains", exception.domain)
    }
    @Test
    fun `test getDomainConfiguration`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getDomainConfiguration("test")
        }
        assertEquals("Domains", exception.domain)
    }
    @Test
    fun `test getDomains`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getDomains()
        }
        assertEquals("Domains", exception.domain)
    }
}
