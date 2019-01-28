package org.ninrod.blog

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import javax.annotation.PostConstruct


fun main(args: Array<String>) {
    SpringApplicationBuilder()
            .bannerMode(Banner.Mode.CONSOLE)
            .sources(BlogApplication::class.java)
            .run(*args)

}

@SpringBootApplication
class BlogApplication {
    companion object {
        val logger: Logger? = LoggerFactory.getLogger(BlogApplication::class.java)
    }
    @PostConstruct
    fun postConstruct() {
        logger?.info("-------------------------Blog Initializing---------------------")
    }
}
