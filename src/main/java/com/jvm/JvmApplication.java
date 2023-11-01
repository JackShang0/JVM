package com.jvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class JvmApplication {
    public static void main(String[] args) {
        SpringApplication.run(JvmApplication.class,args);
    }
}
