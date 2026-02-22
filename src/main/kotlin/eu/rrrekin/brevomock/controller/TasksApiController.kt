package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.TasksApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class TasksApiController : TasksApi {
    override fun crmTasksGet(filterType: kotlin.String?, filterStatus: kotlin.String?, filterDate: kotlin.String?, filterAssignTo: kotlin.String?, filterContacts: kotlin.String?, filterDeals: kotlin.String?, filterCompanies: kotlin.String?, dateFrom: kotlin.Int?, dateTo: kotlin.Int?, offset: kotlin.Long?, limit: kotlin.Long, sort: kotlin.String?, sortBy: kotlin.String?): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CrmTasksGet200Response> {
        throw NotImplementedException("Tasks")
    }
    override fun crmTasksIdDelete(id: kotlin.String): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Tasks")
    }
    override fun crmTasksIdGet(id: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.Task> {
        throw NotImplementedException("Tasks")
    }
    override fun crmTasksIdPatch(id: kotlin.String, crmTasksIdPatchRequest: eu.rrrekin.brevo.model.CrmTasksIdPatchRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Tasks")
    }
    override fun crmTasksPost(crmTasksPostRequest: eu.rrrekin.brevo.model.CrmTasksPostRequest): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CrmTasksPost201Response> {
        throw NotImplementedException("Tasks")
    }
    override fun crmTasktypesGet(): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.CrmTasktypesGet200Response> {
        throw NotImplementedException("Tasks")
    }
}
