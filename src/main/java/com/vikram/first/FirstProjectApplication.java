package com.vikram.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FirstProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);
        System.out.println("use swagger here : http://localhost:8080/swagger-ui/index.html ");
        System.out.println("or u can also use postman");
    }

}
