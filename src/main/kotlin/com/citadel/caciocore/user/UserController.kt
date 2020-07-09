package com.citadel.caciocore.user

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController {
    @RequestMapping("/")
    fun index(): String {
        return "Greetings from Spring Boot!"
    }
}