package com.nomizo.repo

import com.nomizo.model.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : CrudRepository<Student, Int> {
    fun findStudentByUsername(username: String)
}