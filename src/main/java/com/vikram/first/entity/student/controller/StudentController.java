package com.vikram.first.entity.student.controller;

import com.vikram.first.entity.Student;
import com.vikram.first.entity.student.service.StudentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/student")
public class StudentController {
    @Autowired
    private StudentData studentData;

    @PostMapping("/studentdata")
    public String addStudent(@RequestBody Student student) {
        studentData.addStudentData(student);
        return "success";
    }

    @GetMapping("/studentonly")
    public String addStud(@RequestParam String firstName, @RequestParam String lastName) {
        studentData.addRandomMarksStudent(firstName, lastName);
        return "data with name : " + firstName + " " + lastName + "added sucessFully";
    }

    @GetMapping("/randomStudent")
    public String addStu() {
        studentData.saveRandomStudent();
        return "success";
    }

    @PutMapping("updatename")
    public String updateName(@RequestParam int roll, @RequestParam String firstName, @RequestParam String lastName) {
        studentData.updateName(roll, firstName, lastName);
        return "successs";
    }

    @DeleteMapping("/deletestudent")
    public String deleteStudent(@RequestParam Integer rollNumber) {
        studentData.deleteStudent(rollNumber);
        return "student of roll number : " + rollNumber + " deleted";
    }
}
