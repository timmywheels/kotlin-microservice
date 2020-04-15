package com.timwheeler.microservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.web.servlet.ServletComponentScan
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EntityScan
@ServletComponentScan
@EnableAsync
open class ApiApplication {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            SpringApplication.run(ApiApplication::class.java, *args)
        }
    }
}