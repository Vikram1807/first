package com.vikram.first.entity.student.service;

import com.vikram.first.entity.laptopentity.Laptop;
import com.vikram.first.entity.studententity.Student;

/**
 * The interface Student data.
 */
public interface StudentData {

    /**
     * Add student data.
     *
     * @param s the s
     */
    void addStudentData(Student s);

    /**
     * Add random marks student.
     *
     * @param firstName the first name
     * @param lastName  the last name
     */
    void addRandomMarksStudent(String firstName, String lastName);

    /**
     * Save random student.
     */
    void saveRandomStudent();

    /**
     * Update name.
     *
     * @param roll      the roll
     * @param firstName the first name
     * @param lastName  the last name
     */
    void updateName(int roll, String firstName, String lastName);

    /**
     * Delete student.
     *
     * @param rollNumber the roll number
     */
    void deleteStudent(Integer rollNumber);

    /**
     * Save laptop.
     *
     * @param laptop the laptop
     */
    void saveLaptop(Laptop laptop);

    /**
     * Update laptop to rollnumber.
     *
     * @param rollNumber the roll number
     * @param laptop     the laptop
     */
    void updateLaptopToRollnumber(Integer rollNumber, Laptop laptop);
}
