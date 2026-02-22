package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.MasterAccountApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class MasterAccountApiController : MasterAccountApi {
    override fun corporateGroupIdDelete(id: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateGroupIdGet(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CorporateGroupIdGet200Response> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateGroupIdPut(id: kotlin.String, corporateGroupIdPutRequest: eu.rrrekin.brevo.model.CorporateGroupIdPutRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateGroupPost(corporateGroupPostRequest: eu.rrrekin.brevo.model.CorporateGroupPostRequest?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CorporateGroupPost201Response> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateGroupUnlinkGroupIdSubAccountsPut(groupId: kotlin.String, corporateGroupUnlinkGroupIdSubAccountsPutRequest: eu.rrrekin.brevo.model.CorporateGroupUnlinkGroupIdSubAccountsPutRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateIpGet(): org.springframework.http.ResponseEntity<kotlin.collections.List<eu.rrrekin.brevo.model.CorporateIpGet200ResponseInner>> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateMasterAccountGet(): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CorporateMasterAccountGet200Response> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSsoTokenPost(corporateSsoTokenPostRequest: eu.rrrekin.brevo.model.CorporateSsoTokenPostRequest?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSsoToken> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSubAccountGet(offset: kotlin.Int, limit: kotlin.Int): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CorporateSubAccountGet200Response> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSubAccountIdApplicationsTogglePut(id: kotlin.Long, corporateSubAccountIdApplicationsTogglePutRequest: eu.rrrekin.brevo.model.CorporateSubAccountIdApplicationsTogglePutRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSubAccountIdDelete(id: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSubAccountIdGet(id: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CorporateSubAccountIdGet200Response> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSubAccountIdPlanPut(id: kotlin.Long, corporateSubAccountIdPlanPutRequest: eu.rrrekin.brevo.model.CorporateSubAccountIdPlanPutRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSubAccountIpAssociatePost(corporateSubAccountIpAssociatePostRequest: eu.rrrekin.brevo.model.CorporateSubAccountIpAssociatePostRequest?): org.springframework.http.ResponseEntity<kotlin.Any> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSubAccountIpDissociatePut(corporateSubAccountIpDissociatePutRequest: eu.rrrekin.brevo.model.CorporateSubAccountIpDissociatePutRequest?): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSubAccountKeyPost(corporateSubAccountKeyPostRequest: eu.rrrekin.brevo.model.CorporateSubAccountKeyPostRequest?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CorporateSubAccountKeyPost201Response> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSubAccountPost(corporateSubAccountPostRequest: eu.rrrekin.brevo.model.CorporateSubAccountPostRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CorporateSubAccountPost201Response> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSubAccountSsoTokenPost(corporateSubAccountSsoTokenPostRequest: eu.rrrekin.brevo.model.CorporateSubAccountSsoTokenPostRequest?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSsoToken> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateSubAccountsPlanPut(corporateSubAccountsPlanPutRequest: eu.rrrekin.brevo.model.CorporateSubAccountsPlanPutRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateUserEmailPermissionsPut(email: kotlin.String, corporateUserEmailPermissionsPutRequest: eu.rrrekin.brevo.model.CorporateUserEmailPermissionsPutRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateUserInvitationActionEmailPut(action: kotlin.String, email: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CorporateUserInvitationActionEmailPut200Response> {
        throw NotImplementedException("MasterAccount")
    }
    override fun corporateUserRevokeEmailDelete(email: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("MasterAccount")
    }
    override fun getCorporateInvitedUsersList(type: kotlin.String?, offset: kotlin.Int?, limit: kotlin.Int?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetCorporateInvitedUsersList200Response> {
        throw NotImplementedException("MasterAccount")
    }
    override fun getCorporateUserPermission(email: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetCorporateUserPermission200Response> {
        throw NotImplementedException("MasterAccount")
    }
    override fun getSubAccountGroups(): org.springframework.http.ResponseEntity<kotlin.collections.List<eu.rrrekin.brevo.model.GetSubAccountGroups200ResponseInner>> {
        throw NotImplementedException("MasterAccount")
    }
    override fun inviteAdminUser(inviteAdminUserRequest: eu.rrrekin.brevo.model.InviteAdminUserRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CorporateGroupPost201Response> {
        throw NotImplementedException("MasterAccount")
    }
}
