package com.nomizo.controller

import com.nomizo.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    @GetMapping("/findUsers")
    fun getAllUsers() = studentService.findAllStudents()
}