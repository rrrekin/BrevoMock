package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class InboundParsingApiControllerTest {
    private val controller = InboundParsingApiController()
    @Test
    fun `test getInboundEmailAttachment`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getInboundEmailAttachment("test")
        }
        assertEquals("InboundParsing", exception.domain)
    }
    @Test
    fun `test getInboundEmailEvents`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getInboundEmailEvents(null, null, null, 1L, 1L, "test")
        }
        assertEquals("InboundParsing", exception.domain)
    }
    @Test
    fun `test getInboundEmailEventsByUuid`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getInboundEmailEventsByUuid("test")
        }
        assertEquals("InboundParsing", exception.domain)
    }
}
