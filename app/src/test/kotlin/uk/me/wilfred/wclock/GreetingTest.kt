package uk.me.wilfred.wclock

import org.junit.Assert.assertEquals
import org.junit.Test

class GreetingTest {

    @Test
    fun `greeting addresses the given name`() {
        assertEquals("Hello, world!", greeting("world"))
    }

    @Test
    fun `greeting keeps an empty name empty`() {
        assertEquals("Hello, !", greeting(""))
    }
}
