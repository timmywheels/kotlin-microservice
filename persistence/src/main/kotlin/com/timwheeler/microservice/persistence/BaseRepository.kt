package com.timwheeler.microservice.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import java.io.Serializable

@NoRepositoryBean
interface BaseRepository<T, ID : Serializable> : JpaRepository<T, ID>