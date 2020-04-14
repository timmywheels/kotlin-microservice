package com.timwheeler.microservice.api.controllers

import com.timwheeler.microservice.composition.exceptions.NotFoundException

open class BaseController {

    protected fun verifyObjectIsNotNull(obj: Any?, message: String) {
        if (obj == null) {
            throw NotFoundException(message)
        }
    }
}