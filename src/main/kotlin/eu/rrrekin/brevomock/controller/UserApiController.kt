package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.UserApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class UserApiController : UserApi {
    override fun editUserPermission(inviteuser: eu.rrrekin.brevo.model.Inviteuser): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.EditUserPermission200Response> {
        throw NotImplementedException("User")
    }
    override fun getInvitedUsersList(): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetInvitedUsersList200Response> {
        throw NotImplementedException("User")
    }
    override fun getUserPermission(email: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetUserPermission200Response> {
        throw NotImplementedException("User")
    }
    override fun inviteuser(inviteuser: eu.rrrekin.brevo.model.Inviteuser): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Inviteuser200Response> {
        throw NotImplementedException("User")
    }
    override fun putRevokeUserPermission(email: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.PutRevokeUserPermission200Response> {
        throw NotImplementedException("User")
    }
    override fun putresendcancelinvitation(action: kotlin.String, email: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.PutRevokeUserPermission200Response> {
        throw NotImplementedException("User")
    }
}
