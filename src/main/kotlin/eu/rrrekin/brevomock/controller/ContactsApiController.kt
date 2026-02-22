package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.ContactsApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class ContactsApiController : ContactsApi {
    override fun addContactToList(listId: kotlin.Long, addContactToListRequest: eu.rrrekin.brevo.model.AddContactToListRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.PostContactInfo> {
        throw NotImplementedException("Contacts")
    }
    override fun createAttribute(attributeCategory: kotlin.String, attributeName: kotlin.String, createAttributeRequest: eu.rrrekin.brevo.model.CreateAttributeRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
    override fun createContact(createContactRequest: eu.rrrekin.brevo.model.CreateContactRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateContact201Response> {
        throw NotImplementedException("Contacts")
    }
    override fun createDoiContact(createDoiContact: eu.rrrekin.brevo.model.CreateDoiContactRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
    override fun createFolder(createFolder: eu.rrrekin.brevo.model.CreateUpdateFolder): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateWebhook201Response> {
        throw NotImplementedException("Contacts")
    }
    override fun createList(createListRequest: eu.rrrekin.brevo.model.CreateListRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CreateWebhook201Response> {
        throw NotImplementedException("Contacts")
    }
    override fun deleteAttribute(attributeCategory: kotlin.String, attributeName: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
    override fun deleteContact(identifier: eu.rrrekin.brevo.model.GetContactInfoIdentifierParameter, identifierType: kotlin.String?): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
    override fun deleteFolder(folderId: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
    override fun deleteList(listId: kotlin.Long): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
    override fun deleteMultiAttributeOptions(attributeType: kotlin.String, multipleChoiceAttribute: kotlin.String, multipleChoiceAttributeOption: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
    override fun getAttributes(): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetAttributes200Response> {
        throw NotImplementedException("Contacts")
    }
    override fun getContactInfo(identifier: eu.rrrekin.brevo.model.GetContactInfoIdentifierParameter, identifierType: kotlin.String?, startDate: kotlin.String?, endDate: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetContactInfo200Response> {
        throw NotImplementedException("Contacts")
    }
    override fun getContactStats(identifier: eu.rrrekin.brevo.model.GetContactInfoIdentifierParameter, startDate: kotlin.String?, endDate: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetContactStats200Response> {
        throw NotImplementedException("Contacts")
    }
    override fun getContacts(limit: kotlin.Long, offset: kotlin.Long, modifiedSince: kotlin.String?, createdSince: kotlin.String?, sort: kotlin.String, segmentId: kotlin.Long?, listIds: kotlin.collections.List<kotlin.Long>?, filter: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetContacts> {
        throw NotImplementedException("Contacts")
    }
    override fun getContactsFromList(listId: kotlin.Long, modifiedSince: kotlin.String?, limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetContacts> {
        throw NotImplementedException("Contacts")
    }
    override fun getFolder(folderId: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetFolder> {
        throw NotImplementedException("Contacts")
    }
    override fun getFolderLists(folderId: kotlin.Long, limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetFolderLists200Response> {
        throw NotImplementedException("Contacts")
    }
    override fun getFolders(limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetFolders200Response> {
        throw NotImplementedException("Contacts")
    }
    override fun getList(listId: kotlin.Long, startDate: kotlin.String?, endDate: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetList200Response> {
        throw NotImplementedException("Contacts")
    }
    override fun getLists(limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetLists200Response> {
        throw NotImplementedException("Contacts")
    }
    override fun getSegments(limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetSegments200Response> {
        throw NotImplementedException("Contacts")
    }
    override fun importContacts(importContactsRequest: eu.rrrekin.brevo.model.ImportContactsRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ExportWebhooksHistory202Response> {
        throw NotImplementedException("Contacts")
    }
    override fun removeContactFromList(listId: kotlin.Long, contactEmails: eu.rrrekin.brevo.model.RemoveContactFromListRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.PostContactInfo> {
        throw NotImplementedException("Contacts")
    }
    override fun requestContactExport(requestContactExportRequest: eu.rrrekin.brevo.model.RequestContactExportRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.ExportWebhooksHistory202Response> {
        throw NotImplementedException("Contacts")
    }
    override fun updateAttribute(attributeCategory: kotlin.String, attributeName: kotlin.String, updateAttribute: eu.rrrekin.brevo.model.UpdateAttributeRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
    override fun updateBatchContacts(updateBatchContactsRequest: eu.rrrekin.brevo.model.UpdateBatchContactsRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
    override fun updateContact(identifier: eu.rrrekin.brevo.model.GetContactInfoIdentifierParameter, updateContact: eu.rrrekin.brevo.model.UpdateContactRequest, identifierType: kotlin.String?): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
    override fun updateFolder(folderId: kotlin.Long, updateFolder: eu.rrrekin.brevo.model.CreateUpdateFolder): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
    override fun updateList(listId: kotlin.Long, updateListRequest: eu.rrrekin.brevo.model.UpdateListRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Contacts")
    }
}
