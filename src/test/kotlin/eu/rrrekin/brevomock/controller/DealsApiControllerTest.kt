package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class DealsApiControllerTest {
    private val controller = DealsApiController()
    @Test
    fun `test crmAttributesDealsGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmAttributesDealsGet()
        }
        assertEquals("Deals", exception.domain)
    }
    @Test
    fun `test crmDealsGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmDealsGet(null, null, null, null, null, null, null, null)
        }
        assertEquals("Deals", exception.domain)
    }
    @Test
    fun `test crmDealsIdDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmDealsIdDelete("test")
        }
        assertEquals("Deals", exception.domain)
    }
    @Test
    fun `test crmDealsIdGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmDealsIdGet("test")
        }
        assertEquals("Deals", exception.domain)
    }
    @Test
    fun `test crmDealsIdPatch`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmDealsIdPatch("test", mock(eu.rrrekin.brevo.model.CrmDealsIdPatchRequest::class.java))
        }
        assertEquals("Deals", exception.domain)
    }
    @Test
    fun `test crmDealsImportPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmDealsImportPost(null, null)
        }
        assertEquals("Deals", exception.domain)
    }
    @Test
    fun `test crmDealsLinkUnlinkIdPatch`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmDealsLinkUnlinkIdPatch("test", mock(eu.rrrekin.brevo.model.CrmDealsLinkUnlinkIdPatchRequest::class.java))
        }
        assertEquals("Deals", exception.domain)
    }
    @Test
    fun `test crmDealsPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmDealsPost(mock(eu.rrrekin.brevo.model.CrmDealsPostRequest::class.java))
        }
        assertEquals("Deals", exception.domain)
    }
    @Test
    fun `test crmPipelineDetailsAllGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmPipelineDetailsAllGet()
        }
        assertEquals("Deals", exception.domain)
    }
    @Test
    fun `test crmPipelineDetailsGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmPipelineDetailsGet()
        }
        assertEquals("Deals", exception.domain)
    }
    @Test
    fun `test crmPipelineDetailsPipelineIDGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmPipelineDetailsPipelineIDGet("test")
        }
        assertEquals("Deals", exception.domain)
    }
}
