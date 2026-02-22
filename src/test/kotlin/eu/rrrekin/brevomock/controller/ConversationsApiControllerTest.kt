package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class ConversationsApiControllerTest {
    private val controller = ConversationsApiController()
    @Test
    fun `test conversationsAgentOnlinePingPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.conversationsAgentOnlinePingPost(mock(eu.rrrekin.brevo.model.ConversationsAgentOnlinePingPostRequest::class.java))
        }
        assertEquals("Conversations", exception.domain)
    }
    @Test
    fun `test conversationsMessagesIdDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.conversationsMessagesIdDelete("test")
        }
        assertEquals("Conversations", exception.domain)
    }
    @Test
    fun `test conversationsMessagesIdGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.conversationsMessagesIdGet("test")
        }
        assertEquals("Conversations", exception.domain)
    }
    @Test
    fun `test conversationsMessagesIdPut`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.conversationsMessagesIdPut("test", mock(eu.rrrekin.brevo.model.ConversationsMessagesIdPutRequest::class.java))
        }
        assertEquals("Conversations", exception.domain)
    }
    @Test
    fun `test conversationsMessagesPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.conversationsMessagesPost(mock(eu.rrrekin.brevo.model.ConversationsMessagesPostRequest::class.java))
        }
        assertEquals("Conversations", exception.domain)
    }
    @Test
    fun `test conversationsPushedMessagesIdDelete`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.conversationsPushedMessagesIdDelete("test")
        }
        assertEquals("Conversations", exception.domain)
    }
    @Test
    fun `test conversationsPushedMessagesIdGet`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.conversationsPushedMessagesIdGet("test")
        }
        assertEquals("Conversations", exception.domain)
    }
    @Test
    fun `test conversationsPushedMessagesIdPut`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.conversationsPushedMessagesIdPut("test", mock(eu.rrrekin.brevo.model.ConversationsMessagesIdPutRequest::class.java))
        }
        assertEquals("Conversations", exception.domain)
    }
    @Test
    fun `test conversationsPushedMessagesPost`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.conversationsPushedMessagesPost(mock(eu.rrrekin.brevo.model.ConversationsPushedMessagesPostRequest::class.java))
        }
        assertEquals("Conversations", exception.domain)
    }
    @Test
    fun `test conversationsVisitorGroupPut`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.conversationsVisitorGroupPut(mock(eu.rrrekin.brevo.model.ConversationsVisitorGroupPutRequest::class.java))
        }
        assertEquals("Conversations", exception.domain)
    }
}
