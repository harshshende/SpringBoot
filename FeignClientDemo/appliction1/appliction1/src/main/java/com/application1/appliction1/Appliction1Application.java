package com.application1.appliction1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Appliction1Application {

	public static void main(String[] args) {
		SpringApplication.run(Appliction1Application.class, args);
	}

}
