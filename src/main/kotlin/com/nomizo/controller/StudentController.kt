package com.nomizo.controller

import com.nomizo.model.Student
import com.nomizo.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
open class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    @GetMapping("/findAllStudents")
    fun getAllUsers() = studentService.findAllStudents()

    @PostMapping("/addStudent")
    fun postStudent(@RequestBody student: Student) : Student {
        return studentService.addStudent(student)
    }
}