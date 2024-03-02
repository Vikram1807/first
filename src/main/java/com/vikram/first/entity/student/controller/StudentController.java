package com.vikram.first.entity.student.controller;

import com.vikram.first.entity.Student;
import com.vikram.first.entity.student.service.StudentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/student")
public class StudentController {
    @Autowired
    private StudentData studentData;

    @PostMapping("/studentdata")
    public String addStudent(@RequestBody Student student) {
        studentData.addStudentData(student);
        return "success";
    }
}
