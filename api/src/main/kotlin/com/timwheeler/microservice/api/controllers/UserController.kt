package com.timwheeler.microservice.api.controllers

import com.timwheeler.microservice.domain.User
import com.timwheeler.microservice.domain.UserEntity
import com.timwheeler.microservice.persistence.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userRepository: UserRepository): BaseController() {

    @GetMapping
    fun sayHi(): String {
        return "Hi"
    }

    @GetMapping("/{userId}")
    fun getUserById(@PathVariable userId: Long) : User {
//        return "Hello"
        return userRepository.findByUserId(userId)
    }
}