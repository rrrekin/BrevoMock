package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class CompaniesApiControllerTest {
    private val controller = CompaniesApiController()
    @Test
    fun `test companiesGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.companiesGet(null, null, null, null, null, null, null, null, null)
        }
        assertEquals("Companies", exception.domain)
    }
    @Test
    fun `test companiesIdDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.companiesIdDelete("test")
        }
        assertEquals("Companies", exception.domain)
    }
    @Test
    fun `test companiesIdGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.companiesIdGet("test")
        }
        assertEquals("Companies", exception.domain)
    }
    @Test
    fun `test companiesIdPatch`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.companiesIdPatch("test", mock(eu.rrrekin.brevo.model.CompaniesIdPatchRequest::class.java))
        }
        assertEquals("Companies", exception.domain)
    }
    @Test
    fun `test companiesImportPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.companiesImportPost(null, null)
        }
        assertEquals("Companies", exception.domain)
    }
    @Test
    fun `test companiesLinkUnlinkIdPatch`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.companiesLinkUnlinkIdPatch("test", mock(eu.rrrekin.brevo.model.CompaniesLinkUnlinkIdPatchRequest::class.java))
        }
        assertEquals("Companies", exception.domain)
    }
    @Test
    fun `test companiesPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.companiesPost(mock(eu.rrrekin.brevo.model.CompaniesPostRequest::class.java))
        }
        assertEquals("Companies", exception.domain)
    }
    @Test
    fun `test crmAttributesCompaniesGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmAttributesCompaniesGet()
        }
        assertEquals("Companies", exception.domain)
    }
    @Test
    fun `test crmAttributesIdDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmAttributesIdDelete("test")
        }
        assertEquals("Companies", exception.domain)
    }
    @Test
    fun `test crmAttributesIdPatch`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmAttributesIdPatch("test", mock(eu.rrrekin.brevo.model.CrmAttributesIdPatchRequest::class.java))
        }
        assertEquals("Companies", exception.domain)
    }
    @Test
    fun `test crmAttributesPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmAttributesPost(mock(eu.rrrekin.brevo.model.CrmAttributesPostRequest::class.java))
        }
        assertEquals("Companies", exception.domain)
    }
}
