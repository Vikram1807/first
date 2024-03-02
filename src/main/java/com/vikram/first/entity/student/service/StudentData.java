package com.vikram.first.entity.student.service;

import com.vikram.first.entity.Student;

public interface StudentData {

    void addStudentData(Student s);

    void addRandomMarksStudent(String firstName, String lastName);

    void saveRandomStudent();

    void updateName(int roll,String firstName, String lastName);
}
