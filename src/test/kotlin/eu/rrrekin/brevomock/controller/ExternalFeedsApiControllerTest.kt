package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class ExternalFeedsApiControllerTest {
    private val controller = ExternalFeedsApiController()
    @Test
    fun `test createExternalFeed`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createExternalFeed(mock(eu.rrrekin.brevo.model.CreateExternalFeedRequest::class.java))
        }
        assertEquals("ExternalFeeds", exception.domain)
    }
    @Test
    fun `test deleteExternalFeed`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteExternalFeed("test")
        }
        assertEquals("ExternalFeeds", exception.domain)
    }
    @Test
    fun `test getAllExternalFeeds`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getAllExternalFeeds(null, null, null, "test", null, 1L, 1L)
        }
        assertEquals("ExternalFeeds", exception.domain)
    }
    @Test
    fun `test getExternalFeedByUUID`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getExternalFeedByUUID("test")
        }
        assertEquals("ExternalFeeds", exception.domain)
    }
    @Test
    fun `test updateExternalFeed`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateExternalFeed("test", mock(eu.rrrekin.brevo.model.UpdateExternalFeedRequest::class.java))
        }
        assertEquals("ExternalFeeds", exception.domain)
    }
}
