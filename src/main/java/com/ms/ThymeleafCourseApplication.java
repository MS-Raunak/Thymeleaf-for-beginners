package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafCourseApplication.class, args);
		System.out.println("Server started on port:8080");
	}

}
