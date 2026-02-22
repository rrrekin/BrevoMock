package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class MasterAccountApiControllerTest {
    private val controller = MasterAccountApiController()
    @Test
    fun `test corporateGroupIdDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateGroupIdDelete("test")
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateGroupIdGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateGroupIdGet("test")
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateGroupIdPut`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateGroupIdPut("test", mock(eu.rrrekin.brevo.model.CorporateGroupIdPutRequest::class.java))
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateGroupPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateGroupPost(null)
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateGroupUnlinkGroupIdSubAccountsPut`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateGroupUnlinkGroupIdSubAccountsPut("test", mock(eu.rrrekin.brevo.model.CorporateGroupUnlinkGroupIdSubAccountsPutRequest::class.java))
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateIpGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateIpGet()
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateMasterAccountGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateMasterAccountGet()
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSsoTokenPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSsoTokenPost(null)
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSubAccountGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSubAccountGet(1, 1)
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSubAccountIdApplicationsTogglePut`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSubAccountIdApplicationsTogglePut(1L, mock(eu.rrrekin.brevo.model.CorporateSubAccountIdApplicationsTogglePutRequest::class.java))
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSubAccountIdDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSubAccountIdDelete(1L)
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSubAccountIdGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSubAccountIdGet(1L)
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSubAccountIdPlanPut`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSubAccountIdPlanPut(1L, mock(eu.rrrekin.brevo.model.CorporateSubAccountIdPlanPutRequest::class.java))
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSubAccountIpAssociatePost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSubAccountIpAssociatePost(null)
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSubAccountIpDissociatePut`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSubAccountIpDissociatePut(null)
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSubAccountKeyPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSubAccountKeyPost(null)
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSubAccountPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSubAccountPost(mock(eu.rrrekin.brevo.model.CorporateSubAccountPostRequest::class.java))
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSubAccountSsoTokenPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSubAccountSsoTokenPost(null)
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateSubAccountsPlanPut`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateSubAccountsPlanPut(mock(eu.rrrekin.brevo.model.CorporateSubAccountsPlanPutRequest::class.java))
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateUserEmailPermissionsPut`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateUserEmailPermissionsPut("test", mock(eu.rrrekin.brevo.model.CorporateUserEmailPermissionsPutRequest::class.java))
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateUserInvitationActionEmailPut`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateUserInvitationActionEmailPut("test", "test")
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test corporateUserRevokeEmailDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.corporateUserRevokeEmailDelete("test")
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test getCorporateInvitedUsersList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getCorporateInvitedUsersList(null, null, null)
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test getCorporateUserPermission`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getCorporateUserPermission("test")
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test getSubAccountGroups`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSubAccountGroups()
        }
        assertEquals("MasterAccount", exception.domain)
    }
    @Test
    fun `test inviteAdminUser`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.inviteAdminUser(mock(eu.rrrekin.brevo.model.InviteAdminUserRequest::class.java))
        }
        assertEquals("MasterAccount", exception.domain)
    }
}
