package eu.rrrekin.brevomock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BrevoMockApplication

fun main(args: Array<String>) {
	runApplication<BrevoMockApplication>(*args)
}
