package com.nomizo.service

import com.nomizo.model.Student
import com.nomizo.repo.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
open class StudentService {

    @Autowired
    lateinit var studentRepo: StudentRepository

   fun findAllStudents() : MutableIterable<Student> {
       return studentRepo.findAll()
   }

    fun addStudent(student: Student): Student {
        return studentRepo.save(student)
    }
}