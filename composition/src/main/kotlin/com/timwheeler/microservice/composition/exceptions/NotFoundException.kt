package com.timwheeler.microservice.composition.exceptions

import java.lang.RuntimeException

class NotFoundException (override var message: String): RuntimeException(message)