package com.nomizo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCrudApplication

fun main(args: Array<String>) {
	runApplication<KotlinCrudApplication>(*args)
}
