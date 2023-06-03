package com.schoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
@EnableSwagger2
public class SchoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolappApplication.class, args);
	}
	

	

	
}
