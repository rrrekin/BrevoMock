package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class ProcessApiControllerTest {
    private val controller = ProcessApiController()
    @Test
    fun `test getProcess`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getProcess(1L)
        }
        assertEquals("Process", exception.domain)
    }
    @Test
    fun `test getProcesses`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getProcesses(1L, 1L, "test")
        }
        assertEquals("Process", exception.domain)
    }
}
