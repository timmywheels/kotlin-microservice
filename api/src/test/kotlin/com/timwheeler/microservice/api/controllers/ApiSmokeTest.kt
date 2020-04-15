package com.timwheeler.microservice.api.controllers

import com.timwheeler.microservice.persistence.UserRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.ContextConfiguration
import java.lang.Exception

@SpringBootTest
@AutoConfigureMockMvc
class ApiSmokeTest {

    @Autowired
    lateinit var userController: UserController

    @Test
    fun contextLoads(): Unit {
        print(userController)
        assertThat(userController).isNotNull
    }


}