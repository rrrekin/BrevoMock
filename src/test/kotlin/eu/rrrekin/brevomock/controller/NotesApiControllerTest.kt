package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class NotesApiControllerTest {
    private val controller = NotesApiController()
    @Test
    fun `test crmNotesGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmNotesGet(null, null, null, null, null, 1L, null)
        }
        assertEquals("Notes", exception.domain)
    }
    @Test
    fun `test crmNotesIdDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmNotesIdDelete("test")
        }
        assertEquals("Notes", exception.domain)
    }
    @Test
    fun `test crmNotesIdGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmNotesIdGet("test")
        }
        assertEquals("Notes", exception.domain)
    }
    @Test
    fun `test crmNotesIdPatch`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmNotesIdPatch("test", mock(eu.rrrekin.brevo.model.NoteData::class.java))
        }
        assertEquals("Notes", exception.domain)
    }
    @Test
    fun `test crmNotesPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmNotesPost(mock(eu.rrrekin.brevo.model.NoteData::class.java))
        }
        assertEquals("Notes", exception.domain)
    }
}
