package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.FilesApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class FilesApiController : FilesApi {
    override fun crmFilesGet(entity: kotlin.String?, entityIds: kotlin.String?, dateFrom: kotlin.Int?, dateTo: kotlin.Int?, offset: kotlin.Long?, limit: kotlin.Long, sort: kotlin.String?): org.springframework.http.ResponseEntity<kotlin.collections.List<eu.rrrekin.brevo.model.FileData>> {
        throw NotImplementedException("Files")
    }
    override fun crmFilesIdDataGet(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.FileData> {
        throw NotImplementedException("Files")
    }
    override fun crmFilesIdDelete(id: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Files")
    }
    override fun crmFilesIdGet(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CrmFilesIdGet200Response> {
        throw NotImplementedException("Files")
    }
    override fun crmFilesPost(file: org.springframework.web.multipart.MultipartFile, companyId: kotlin.String?, contactId: kotlin.Long?, dealId: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.FileData> {
        throw NotImplementedException("Files")
    }
}
