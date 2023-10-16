package com.example.myfirstunittest


import com.google.common.truth.Truth.*
import org.junit.Test

class HomeworkTest {

    @Test
    fun `is fib return correct value for 0`() {
        val result = Homework.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `is fib return correct value for 1`() {
        val result = Homework.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `is fib return correct value for 3`() {
        val result = Homework.fib(3)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `is fib return correct value for 10`() {
        val result = Homework.fib(10)
        assertThat(result).isEqualTo(34)
    }
}