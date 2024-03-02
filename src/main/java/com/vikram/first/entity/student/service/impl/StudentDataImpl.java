package com.vikram.first.entity.student.service.impl;

import com.vikram.first.config.HibernateConfig;
import com.vikram.first.entity.Student;
import com.vikram.first.entity.student.service.StudentData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.stat.SessionStatistics;
import org.springframework.stereotype.Component;

@Component
public class StudentDataImpl implements StudentData {


    @Override
    public void addStudentData(Student student) {
        SessionFactory sf = HibernateConfig.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Object a = s.save(student);
        tx.commit();
    }
}
