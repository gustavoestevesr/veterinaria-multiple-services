package com.veterinaria.petms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PetMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetMsApplication.class, args);
	}

}
