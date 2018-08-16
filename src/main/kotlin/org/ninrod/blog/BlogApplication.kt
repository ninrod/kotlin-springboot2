package org.ninrod.blog

import org.slf4j.LoggerFactory

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import javax.annotation.PostConstruct

@SpringBootApplication
class BlogApplication : SpringBootServletInitializer() {
    companion object {
        val logger = LoggerFactory.getLogger(BlogApplication.javaClass)
    }
    @PostConstruct
    fun postConstruct() {
        BlogApplication.logger.info("-------------------------Blog Initializing---------------------")
    }
}

fun main(args: Array<String>) {
    runApplication<BlogApplication>(*args)
}

