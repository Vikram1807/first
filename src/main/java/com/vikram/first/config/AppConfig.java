package com.vikram.first.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {


    @Value("${spring.h2.console.enabled}")
    private boolean isH2Enabled;

    @Bean
    public DataSource getDataSource() {
        if (isH2Enabled) {
            System.out.println("get your database at : http://localhost:8080/h2-console " + " " + " after opening url put : " + " " + "jdbc:h2:mem:vikram" + " " + "on JDBC URL");
            return DataSourceBuilder.create().
                    driverClassName("org.h2.Driver")
                    .url("jdbc:h2:mem:vikram")
                    .username("sa").password("")
                    .build();
        } else {
            return DataSourceBuilder.create().
                    driverClassName("com.mysql.cj.jdbc.Driver")
                    .url("jdbc:mysql://localhost:3306/vikram")
                    .username("root")
                    .password("root")
                    .build();
        }
    }
}
