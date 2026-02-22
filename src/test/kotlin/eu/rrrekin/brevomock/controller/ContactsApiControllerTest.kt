package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.exception.NotImplementedException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class ContactsApiControllerTest {
    private val controller = ContactsApiController()
    @Test
    fun `test addContactToList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.addContactToList(1L, mock(eu.rrrekin.brevo.model.AddContactToListRequest::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test createAttribute`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createAttribute("test", "test", mock(eu.rrrekin.brevo.model.CreateAttributeRequest::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test createContact`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createContact(mock(eu.rrrekin.brevo.model.CreateContactRequest::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test createDoiContact`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createDoiContact(mock(eu.rrrekin.brevo.model.CreateDoiContactRequest::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test createFolder`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createFolder(mock(eu.rrrekin.brevo.model.CreateUpdateFolder::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test createList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.createList(mock(eu.rrrekin.brevo.model.CreateListRequest::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test deleteAttribute`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteAttribute("test", "test")
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test deleteContact`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteContact(mock(eu.rrrekin.brevo.model.GetContactInfoIdentifierParameter::class.java), null)
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test deleteFolder`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteFolder(1L)
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test deleteList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteList(1L)
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test deleteMultiAttributeOptions`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.deleteMultiAttributeOptions("test", "test", "test")
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test getAttributes`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getAttributes()
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test getContactInfo`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getContactInfo(mock(eu.rrrekin.brevo.model.GetContactInfoIdentifierParameter::class.java), null, null, null)
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test getContactStats`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getContactStats(mock(eu.rrrekin.brevo.model.GetContactInfoIdentifierParameter::class.java), null, null)
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test getContacts`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getContacts(1L, 1L, null, null, "test", null, null, null)
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test getContactsFromList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getContactsFromList(1L, null, 1L, 1L, "test")
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test getFolder`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getFolder(1L)
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test getFolderLists`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getFolderLists(1L, 1L, 1L, "test")
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test getFolders`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getFolders(1L, 1L, "test")
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test getList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getList(1L, null, null)
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test getLists`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getLists(1L, 1L, "test")
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test getSegments`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.getSegments(1L, 1L, "test")
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test importContacts`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.importContacts(mock(eu.rrrekin.brevo.model.ImportContactsRequest::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test removeContactFromList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.removeContactFromList(1L, mock(eu.rrrekin.brevo.model.RemoveContactFromListRequest::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test requestContactExport`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.requestContactExport(mock(eu.rrrekin.brevo.model.RequestContactExportRequest::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test updateAttribute`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateAttribute("test", "test", mock(eu.rrrekin.brevo.model.UpdateAttributeRequest::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test updateBatchContacts`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateBatchContacts(mock(eu.rrrekin.brevo.model.UpdateBatchContactsRequest::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test updateContact`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateContact(mock(eu.rrrekin.brevo.model.GetContactInfoIdentifierParameter::class.java), mock(eu.rrrekin.brevo.model.UpdateContactRequest::class.java), null)
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test updateFolder`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateFolder(1L, mock(eu.rrrekin.brevo.model.CreateUpdateFolder::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
    @Test
    fun `test updateList`() {
        val exception = assertThrows(NotImplementedException::class.java) {
            controller.updateList(1L, mock(eu.rrrekin.brevo.model.UpdateListRequest::class.java))
        }
        assertEquals("Contacts", exception.domain)
    }
}
