package com.vikram.first.entity.student.service.impl;

import com.vikram.first.config.HibernateConfig;
import com.vikram.first.entity.laptopentity.Laptop;
import com.vikram.first.entity.student.service.StudentData;
import com.vikram.first.entity.studententity.Marks;
import com.vikram.first.entity.studententity.Name;
import com.vikram.first.entity.studententity.Student;
import org.apache.commons.lang3.RandomStringUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * The type Student data.
 */
@Component
public class StudentDataImpl implements StudentData {

    private void saveStudent(Student student) {
        SessionFactory sf = HibernateConfig.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(student);
        tx.commit();
    }

    @Override
    public void addStudentData(Student student) {
        saveStudent(student);
    }

    @Override
    public void addRandomMarksStudent(String firstName, String lastName) {
        Student s = new Student();
        Name n = new Name();
        n.setFirstName(firstName);
        n.setLastName(lastName);
        s.setName(n);
        Marks marks = getMarks();
        s.setMarks(marks);
        saveStudent(s);
    }

    private Marks getMarks() {
        Marks marks = new Marks();
        Random r = new Random();
        marks.setEnglish(r.nextInt(100));
        marks.setMath(r.nextInt(100));
        marks.setHindi(r.nextInt(100));
        marks.setScience(r.nextInt(100));
        marks.setSocial(r.nextInt(100));
        return marks;
    }

    @Override
    public void saveRandomStudent() {
        Student student = new Student();
        Name name = new Name();
        name.setFirstName(RandomStringUtils.randomAlphabetic(4, 9));
        name.setLastName(RandomStringUtils.randomAlphabetic(5, 10));
        student.setName(name);
        Marks marks = getMarks();
        student.setMarks(marks);
        saveStudent(student);

    }

    private Student fetch(int rollNu) {
        SessionFactory sf = HibernateConfig.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        return s.get(Student.class, rollNu);
    }

    @Override
    public void updateName(int roll, String firstName, String lastName) {
        Student s = fetch(roll);
        Name name = new Name();
        name.setFirstName(firstName);
        name.setLastName(lastName);
        s.setName(name);
        updateStudent(s);
    }

    @Override
    public void deleteStudent(Integer rollNumber) {
        SessionFactory sf = HibernateConfig.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Student st = fetch(rollNumber);
        s.delete(st);
        tx.commit();
    }

    @Override
    public void saveLaptop(Laptop laptop) {
        saveLaptops(laptop);
    }

    @Override
    public void updateLaptopToRollnumber(Integer rollNumber, Laptop laptop) {
        Student s = fetch(rollNumber);
        Laptop l = new Laptop();
        l.setLaptopId(laptop.getLaptopId());
        s.setLaptop(l);
        updateStudent(s);
    }

    private void saveLaptops(Laptop laptop) {
        SessionFactory sf = HibernateConfig.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(laptop);
        tx.commit();
    }

    private void updateStudent(Student student) {
        SessionFactory sf = HibernateConfig.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.saveOrUpdate(student);
        tx.commit();
    }
}
