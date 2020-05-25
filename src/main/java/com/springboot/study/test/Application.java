package com.springboot.study.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.springboot.study.test")
public class Application {
    public static void main(String[]args){
        SpringApplication.run(Application.class, args);
    }
}
