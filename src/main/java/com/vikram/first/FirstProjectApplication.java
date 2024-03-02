package com.vikram.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {


    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);
        System.out.println("use swagger here : http://localhost:8080/swagger-ui/index.html ");
    }

}
