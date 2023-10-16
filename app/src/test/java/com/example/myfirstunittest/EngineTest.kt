package com.example.myfirstunittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


class EngineTest {
    private lateinit var engine : Engine

    @Before
    fun setUp(){
        engine = Engine(2000, 189, 15, false)
    }

    @Test
    fun engine_turns_on() {
        engine.turnOn()
        assertThat(engine.isTurnedOn).isTrue()
        assertThat(engine.temperature).isEqualTo(95)
    }

    @Test
    fun engine_turns_off() {
        engine.turnOff()
        assertThat(engine.isTurnedOn).isFalse()
        assertThat(engine.temperature).isEqualTo(50)

    }
}