package com.timwheeler.microservice.persistence

import com.timwheeler.microservice.domain.User
import com.timwheeler.microservice.domain.UserEntity
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.NoRepositoryBean
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import java.io.Serializable

//interface UserRepository<T, ID> : BaseRepository<UserEntity, Long> {
//    @Query("select u from UserEntity u where u.id = :userId")
//    fun findByUserId(
//        @Param("userId") userId: Long
//    ): User
//}