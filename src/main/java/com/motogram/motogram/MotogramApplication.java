package com.motogram.motogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MotogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotogramApplication.class, args);
	}

}
