package org.ninrod.blog

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import org.hamcrest.Matchers.`is`

@ExtendWith(SpringExtension::class)
@WebMvcTest(GreetingController::class)
class ControllerTests(@Autowired val mvc: MockMvc) {
    @Test
    fun `should return hello world`() {
        mvc.perform(get("/").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk)
                .andExpect(jsonPath("$.id", `is`(1)))
                .andExpect(jsonPath("$.content", `is`("Hello, World")))
    }

    @Test
    fun `should return hello, ninrod`() {
        val exp = "NiNRoD"
        mvc.perform(get("/?name=$exp").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk)
                .andExpect(jsonPath("$.content", `is`("Hello, $exp")))
    }

    @TestConfiguration
    class Config {
        @Bean
        fun repo(): UserRepository = Mockito.mock(UserRepository::class.java)
    }
}
