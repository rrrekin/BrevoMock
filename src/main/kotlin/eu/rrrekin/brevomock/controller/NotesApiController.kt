package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.NotesApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class NotesApiController : NotesApi {
    override fun crmNotesGet(entity: kotlin.String?, entityIds: kotlin.String?, dateFrom: kotlin.Int?, dateTo: kotlin.Int?, offset: kotlin.Long?, limit: kotlin.Long, sort: kotlin.String?): org.springframework.http.ResponseEntity<kotlin.collections.List<eu.rrrekin.brevo.model.Note>> {
        throw NotImplementedException("Notes")
    }
    override fun crmNotesIdDelete(id: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Notes")
    }
    override fun crmNotesIdGet(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Note> {
        throw NotImplementedException("Notes")
    }
    override fun crmNotesIdPatch(id: kotlin.String, noteData: eu.rrrekin.brevo.model.NoteData): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Notes")
    }
    override fun crmNotesPost(noteData: eu.rrrekin.brevo.model.NoteData): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CrmNotesPost200Response> {
        throw NotImplementedException("Notes")
    }
}
