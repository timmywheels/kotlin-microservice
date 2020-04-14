package com.timwheeler.microservice.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.web.servlet.ServletComponentScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication(scanBasePackages = ["com.timwheeler.microservice"])
@EntityScan(basePackages = ["com.timwheeler.microservice.domain"])
@ServletComponentScan(basePackages = ["com.timwheeler.microservice"])
@ComponentScan(basePackages = ["com.timwheeler.microservice"])
@EnableAsync
open class ApiApplication {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            SpringApplication.run(ApiApplication::class.java, *args)
        }
    }
}