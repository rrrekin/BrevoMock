package eu.rrrekin.brevo.exception

class NotImplementedException(val domain: String) : RuntimeException("Domain $domain is not yet implemented.")
