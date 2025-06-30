package com.abdoulayediallo.StagiaireService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // Active OpenFeign
public class StagiaireServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StagiaireServiceApplication.class, args);
	}

}
