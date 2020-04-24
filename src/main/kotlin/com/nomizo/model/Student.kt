package com.nomizo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Student constructor(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val sid: Int,
        val firstName: String,
        val lastName: String,
        val username: String,
        val password: String,
        val email: String
) {}