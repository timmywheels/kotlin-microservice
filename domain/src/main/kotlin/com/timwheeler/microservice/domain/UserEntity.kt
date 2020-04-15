package com.timwheeler.microservice.domain

import javax.persistence.*

@Entity
@Table(name = "users")
data class UserEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val first_name: String,
    val last_name: String,
    val email: String
): User {
    constructor(): this(1, "Timothy", "Wheeler", "tim@timwheeler.com")
}