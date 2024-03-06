package com.vikram.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type First project application.
 */
@SpringBootApplication
public class FirstProjectApplication {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);
        System.out.println("use swagger here : http://localhost:8080/swagger-ui/index.html ");
    }

}
