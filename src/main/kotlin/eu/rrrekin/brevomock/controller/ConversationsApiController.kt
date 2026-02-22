package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.ConversationsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class ConversationsApiController : ConversationsApi {
    override fun conversationsAgentOnlinePingPost(conversationsAgentOnlinePingPostRequest: eu.rrrekin.brevo.model.ConversationsAgentOnlinePingPostRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Conversations")
    }
    override fun conversationsMessagesIdDelete(id: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Conversations")
    }
    override fun conversationsMessagesIdGet(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ConversationsMessage> {
        throw NotImplementedException("Conversations")
    }
    override fun conversationsMessagesIdPut(id: kotlin.String, conversationsMessagesIdPutRequest: eu.rrrekin.brevo.model.ConversationsMessagesIdPutRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ConversationsMessage> {
        throw NotImplementedException("Conversations")
    }
    override fun conversationsMessagesPost(conversationsMessagesPostRequest: eu.rrrekin.brevo.model.ConversationsMessagesPostRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ConversationsMessage> {
        throw NotImplementedException("Conversations")
    }
    override fun conversationsPushedMessagesIdDelete(id: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Conversations")
    }
    override fun conversationsPushedMessagesIdGet(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ConversationsMessage> {
        throw NotImplementedException("Conversations")
    }
    override fun conversationsPushedMessagesIdPut(id: kotlin.String, conversationsMessagesIdPutRequest: eu.rrrekin.brevo.model.ConversationsMessagesIdPutRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ConversationsMessage> {
        throw NotImplementedException("Conversations")
    }
    override fun conversationsPushedMessagesPost(conversationsPushedMessagesPostRequest: eu.rrrekin.brevo.model.ConversationsPushedMessagesPostRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ConversationsMessage> {
        throw NotImplementedException("Conversations")
    }
    override fun conversationsVisitorGroupPut(conversationsVisitorGroupPutRequest: eu.rrrekin.brevo.model.ConversationsVisitorGroupPutRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ConversationsVisitorGroupPut200Response> {
        throw NotImplementedException("Conversations")
    }
}
