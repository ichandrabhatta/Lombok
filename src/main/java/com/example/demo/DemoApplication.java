package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.controller", "com.example.service"})
@EntityScan({"com.example.entity","com.example.repository"})
@EnableJpaRepositories(basePackages ="com.example.repository")
public class DemoApplication {

	public static void main(String[] args) {
		System.out.print("Indira test ...................");
		SpringApplication.run(DemoApplication.class, args);
	}

}
