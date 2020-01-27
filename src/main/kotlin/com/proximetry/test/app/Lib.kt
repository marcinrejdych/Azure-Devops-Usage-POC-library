package com.proximetry.test.app

import java.util.*

class Lib {
    companion object {
        fun generateMessage(): String {
            return "Hello world with uuid ${UUID.randomUUID()}"
        }
    }
}
