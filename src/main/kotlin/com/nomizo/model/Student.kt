package com.nomizo.model

import javax.persistence.*

@Entity
data class Student constructor(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "student_id")
        val sid: Int,
        val firstName: String,
        val lastName: String,
        val username: String,
        val password: String,
        val email: String
) {}