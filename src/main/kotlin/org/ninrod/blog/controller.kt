package org.ninrod.blog

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

data class Greeting(val id: Long, val content: String)
@RestController
class GreetingController(val userRepo: UserRepository) {
    private val log = LoggerFactory.getLogger(BlogApplication::class.java)
    val counter = AtomicLong()

    @GetMapping("/")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
        log.info("$name was passed to the url. counter = $counter.")
        return Greeting(counter.incrementAndGet(), "Hello, $name")
    }

    @GetMapping("/persist")
    fun persist() {
        val juergen = Usuario("springjuergen", "Juergen", "Hoeller")
        log.info("trying to persist ${juergen.firstname}")
        userRepo.save(juergen);
        log.info("${juergen.firstname} was persisted")
    }
}