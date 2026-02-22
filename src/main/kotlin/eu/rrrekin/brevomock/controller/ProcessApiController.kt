package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.ProcessApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class ProcessApiController : ProcessApi {
    override fun getProcess(processId: kotlin.Long): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetProcess200Response> {
        throw NotImplementedException("Process")
    }
    override fun getProcesses(limit: kotlin.Long, offset: kotlin.Long, sort: kotlin.String): org.springframework.http.ResponseEntity<eu.rrrekin.brevo.model.GetProcesses200Response> {
        throw NotImplementedException("Process")
    }
}
