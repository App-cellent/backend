package com.example.dotheG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DotheGApplication {

	public static void main(String[] args) {
		SpringApplication.run(DotheGApplication.class, args);
	}

}
