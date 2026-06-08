package com.example.demo_one.health

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Health {
    @GetMapping("/health")
    fun index(@RequestParam("name") name: String  ) = "Hello $name!"
}