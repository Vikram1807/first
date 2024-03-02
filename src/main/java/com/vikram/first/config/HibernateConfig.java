package com.vikram.first.config;

import com.vikram.first.entity.laptopentity.Laptop;
import com.vikram.first.entity.studententity.Student;
import jakarta.annotation.PostConstruct;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Properties;

@Component
public class HibernateConfig {
    private static SessionFactory sessionFactory;
    private static String isH2Enabled;
    @Value("${spring.h2.console.enabled}")
    private String h2;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            if (Objects.equals(isH2Enabled, "true")) {
                properties.setProperty(Environment.DRIVER, "org.h2.Driver");
                properties.setProperty(Environment.URL, "jdbc:h2:mem:vikram");
                properties.setProperty(Environment.USER, "sa");
                properties.setProperty(Environment.PASS, "");
            } else {
                properties.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                properties.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/vikram");
                properties.setProperty(Environment.USER, "root");
                properties.setProperty(Environment.PASS, "root");
            }
            properties.setProperty(Environment.SHOW_SQL, "true");
            properties.setProperty(Environment.HBM2DDL_AUTO, "create-drop");
            properties.setProperty(Environment.AUTOCOMMIT, "true");
            properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(Student.class);
            configuration.addAnnotatedClass(Laptop.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        }
        return sessionFactory;
    }

    @PostConstruct
    public void init() {
        isH2Enabled = h2;
    }

}
