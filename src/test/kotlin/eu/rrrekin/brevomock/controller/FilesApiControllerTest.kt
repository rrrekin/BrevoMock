package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class FilesApiControllerTest {
    private val controller = FilesApiController()
    @Test
    fun `test crmFilesGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmFilesGet(null, null, null, null, null, 1L, null)
        }
        assertEquals("Files", exception.domain)
    }
    @Test
    fun `test crmFilesIdDataGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmFilesIdDataGet("test")
        }
        assertEquals("Files", exception.domain)
    }
    @Test
    fun `test crmFilesIdDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmFilesIdDelete("test")
        }
        assertEquals("Files", exception.domain)
    }
    @Test
    fun `test crmFilesIdGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmFilesIdGet("test")
        }
        assertEquals("Files", exception.domain)
    }
    @Test
    fun `test crmFilesPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.crmFilesPost(mock(org.springframework.web.multipart.MultipartFile::class.java), null, null, null)
        }
        assertEquals("Files", exception.domain)
    }
}
