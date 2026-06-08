package com.example.demo_one

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@SpringBootApplication
class DemoOneApplication

fun main(args: Array<String>) {
	runApplication<DemoOneApplication>(*args)
}