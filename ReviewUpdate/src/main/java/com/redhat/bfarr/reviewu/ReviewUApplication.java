package com.redhat.bfarr.reviewu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.redhat.bfarr.reviewu")
public class ReviewUApplication {
	 public static void main(String[] args) {
        SpringApplication.run(ReviewUApplication.class, args);
    }
}
