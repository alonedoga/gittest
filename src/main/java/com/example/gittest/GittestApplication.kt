package com.example.gittest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object GittestApplication {

    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(GittestApplication::class.java, *args)
    }

}
