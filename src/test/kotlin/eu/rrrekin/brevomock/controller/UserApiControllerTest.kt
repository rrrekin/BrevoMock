package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class UserApiControllerTest {
    private val controller = UserApiController()
    @Test
    fun `test editUserPermission`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.editUserPermission(mock(eu.rrrekin.brevo.model.Inviteuser::class.java))
        }
        assertEquals("User", exception.domain)
    }
    @Test
    fun `test getInvitedUsersList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getInvitedUsersList()
        }
        assertEquals("User", exception.domain)
    }
    @Test
    fun `test getUserPermission`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getUserPermission("test")
        }
        assertEquals("User", exception.domain)
    }
    @Test
    fun `test inviteuser`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.inviteuser(mock(eu.rrrekin.brevo.model.Inviteuser::class.java))
        }
        assertEquals("User", exception.domain)
    }
    @Test
    fun `test putRevokeUserPermission`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.putRevokeUserPermission("test")
        }
        assertEquals("User", exception.domain)
    }
    @Test
    fun `test putresendcancelinvitation`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.putresendcancelinvitation("test", "test")
        }
        assertEquals("User", exception.domain)
    }
}
