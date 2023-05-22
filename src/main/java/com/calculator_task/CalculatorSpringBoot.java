package com.calculator_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.calculator_task"})
public class CalculatorSpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(CalculatorSpringBoot.class, args);
    }
}
