package org.ninrod.blog.blog

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

// pq isso não funciona?
//@ExtendWith(SpringExtension::class)
@SpringBootTest
class MyTest {
    @Test
    fun mytest() {
        Assertions.assertEquals(4, 2 * 2)
    }
}
