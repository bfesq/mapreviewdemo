package com.redhat.bfarr.reviewq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.redhat.bfarr.reviewq")
public class ReviewQApplication {
	 public static void main(String[] args) {
        SpringApplication.run(ReviewQApplication.class, args);
    }
}
