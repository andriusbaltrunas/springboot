package com.andrius.baltrunas.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootConfiguration
@ComponentScan("com.andrius.baltrunas.springboot")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
