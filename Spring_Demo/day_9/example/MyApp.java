package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) {

        // Embedded Tomcat starts automatically
        SpringApplication.run(MyApp.class, args);
    }
}