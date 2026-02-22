package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class CustomObjectsApiControllerTest {
    private val controller = CustomObjectsApiController()
    @Test
    fun `test batchDeleteObjectRecords`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.batchDeleteObjectRecords("test", mock(eu.rrrekin.brevo.model.BatchDeleteObjectRecordsRequest::class.java))
        }
        assertEquals("CustomObjects", exception.domain)
    }
    @Test
    fun `test getrecords`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getrecords("test", 1L, 1L, "test", null)
        }
        assertEquals("CustomObjects", exception.domain)
    }
    @Test
    fun `test upsertrecords`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.upsertrecords("test", mock(eu.rrrekin.brevo.model.UpsertrecordsRequest::class.java))
        }
        assertEquals("CustomObjects", exception.domain)
    }
}
