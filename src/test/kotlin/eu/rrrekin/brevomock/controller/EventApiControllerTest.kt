package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class EventApiControllerTest {
    private val controller = EventApiController()
    @Test
    fun `test createEvent`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createEvent(mock(eu.rrrekin.brevo.model.CreateEventRequest::class.java))
        }
        assertEquals("Event", exception.domain)
    }
}
