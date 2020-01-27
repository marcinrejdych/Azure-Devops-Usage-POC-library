package com.proximetry.test.app

import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test
    fun testAppHasAGreeting() {
        assertNotNull(Lib.generateMessage(), "message should be generated")
    }
}
