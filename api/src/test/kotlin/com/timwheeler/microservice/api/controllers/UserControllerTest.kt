package com.timwheeler.microservice.api.controllers

import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.whenever
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@WebMvcTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    lateinit var mvc: MockMvc

    @MockBean
    lateinit var userController: UserController

    @Test
    fun userControllerShouldReturnResponse() : Unit {
        whenever(userController.sayHi()).doReturn("yes")

        val response = mvc.perform(
            MockMvcRequestBuilders.get("/api/users/1")
                .accept(MediaType.APPLICATION_JSON)
        )
            .andExpect(MockMvcResultMatchers.status().is2xxSuccessful)
            .andReturn()

        print(response.response.contentAsString)
    }

}