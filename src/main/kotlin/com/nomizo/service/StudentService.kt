package com.nomizo.service

import com.nomizo.model.Student
import com.nomizo.repo.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
open class StudentService {

    @Autowired
    lateinit var studentRepo: StudentRepository

   fun allStudents() = studentRepo.findAll()
}