package com.vikram.first.entity.student.service;

import com.vikram.first.entity.laptopentity.Laptop;
import com.vikram.first.entity.studententity.Student;

public interface StudentData {

    void addStudentData(Student s);

    void addRandomMarksStudent(String firstName, String lastName);

    void saveRandomStudent();

    void updateName(int roll,String firstName, String lastName);

    void deleteStudent(Integer rollNumber);

    void saveLaptop(Laptop laptop);

    void updateLaptopToRollnumber(Integer rollNumber,Laptop laptop);
}
