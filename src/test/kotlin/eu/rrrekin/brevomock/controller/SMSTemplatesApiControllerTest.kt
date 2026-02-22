package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class SMSTemplatesApiControllerTest {
    private val controller = SMSTemplatesApiController()
    @Test
    fun `test getSMSTemplates`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSMSTemplates(1L, 1L, "test")
        }
        assertEquals("SMSTemplates", exception.domain)
    }
}
