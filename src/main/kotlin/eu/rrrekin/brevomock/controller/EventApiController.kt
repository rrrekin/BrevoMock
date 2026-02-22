package eu.rrrekin.brevomock.controller

import eu.rrrekin.brevo.api.EventApi
import eu.rrrekin.brevo.exception.NotImplementedException
import org.springframework.web.bind.annotation.RestController

@RestController
class EventApiController : EventApi {
    override fun createEvent(createEventRequest: eu.rrrekin.brevo.model.CreateEventRequest): org.springframework.http.ResponseEntity<kotlin.Unit> {
        throw NotImplementedException("Event")
    }
}
