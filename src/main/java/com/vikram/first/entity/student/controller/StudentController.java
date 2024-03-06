package com.vikram.first.entity.student.controller;

import com.vikram.first.entity.laptopentity.Laptop;
import com.vikram.first.entity.student.service.StudentData;
import com.vikram.first.entity.studententity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * The type Student controller.
 */
@RestController("/student")
public class StudentController {
    @Autowired
    private StudentData studentData;

    /**
     * Add student string.
     *
     * @param student the student
     * @return the string
     */
    @PostMapping("/studentdata")
    public String addStudent(@RequestBody Student student) {
        studentData.addStudentData(student);
        return "success";
    }

    /**
     * Add stud string.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @return the string
     */
    @GetMapping("/studentonly")
    public String addStud(@RequestParam String firstName, @RequestParam String lastName) {
        studentData.addRandomMarksStudent(firstName, lastName);
        return "data with name : " + firstName + " " + lastName + "added sucessFully";
    }

    /**
     * Add stu string.
     *
     * @return the string
     */
    @GetMapping("/randomStudent")
    public String addStu() {
        studentData.saveRandomStudent();
        return "success";
    }

    /**
     * Update name string.
     *
     * @param roll      the roll
     * @param firstName the first name
     * @param lastName  the last name
     * @return the string
     */
    @PutMapping("updatename")
    public String updateName(@RequestParam int roll, @RequestParam String firstName, @RequestParam String lastName) {
        studentData.updateName(roll, firstName, lastName);
        return "successs";
    }

    /**
     * Delete student string.
     *
     * @param rollNumber the roll number
     * @return the string
     */
    @DeleteMapping("/deletestudent")
    public String deleteStudent(@RequestParam Integer rollNumber) {
        studentData.deleteStudent(rollNumber);
        return "student of roll number : " + rollNumber + " deleted";
    }

    /**
     * Allot laptop.
     *
     * @param laptop     the laptop
     * @param rollNumber the roll number
     */
    @PostMapping("allocateLaptop")
    public void allotLaptop(@RequestBody Laptop laptop, @RequestParam Integer rollNumber) {
        studentData.saveLaptop(laptop);
        studentData.updateLaptopToRollnumber(rollNumber, laptop);
    }
}
