package org.ninrod.blog

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class BlogApplication : SpringBootServletInitializer() {
    companion object {
        val logger = LoggerFactory.getLogger(BlogApplication.javaClass)
    }
    override fun createSpringApplicationBuilder(): SpringApplicationBuilder {
        System.out.println("INIT")
        logger.info("Initializing")
        return SpringApplicationBuilder()
    }
}

fun main(args: Array<String>) {
    runApplication<BlogApplication>(*args)
}

