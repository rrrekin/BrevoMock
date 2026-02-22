package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class TasksApiControllerTest {
    private val controller = TasksApiController()
    @Test
    fun `test crmTasksGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmTasksGet(null, null, null, null, null, null, null, null, null, null, 1L, null, null)
        }
        assertEquals("Tasks", exception.domain)
    }
    @Test
    fun `test crmTasksIdDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmTasksIdDelete("test")
        }
        assertEquals("Tasks", exception.domain)
    }
    @Test
    fun `test crmTasksIdGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmTasksIdGet("test")
        }
        assertEquals("Tasks", exception.domain)
    }
    @Test
    fun `test crmTasksIdPatch`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmTasksIdPatch("test", mock(eu.rrrekin.brevo.model.CrmTasksIdPatchRequest::class.java))
        }
        assertEquals("Tasks", exception.domain)
    }
    @Test
    fun `test crmTasksPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmTasksPost(mock(eu.rrrekin.brevo.model.CrmTasksPostRequest::class.java))
        }
        assertEquals("Tasks", exception.domain)
    }
    @Test
    fun `test crmTasktypesGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmTasktypesGet()
        }
        assertEquals("Tasks", exception.domain)
    }
}
