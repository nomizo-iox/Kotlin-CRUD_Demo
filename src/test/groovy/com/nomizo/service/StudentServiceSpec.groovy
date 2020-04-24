package com.nomizo.service

import com.nomizo.repo.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

class StudentServiceSpec extends Specification {

    @Autowired
    StudentRepository studentRepository
    def "Should find all users"() {
        when: ''
    }

}
