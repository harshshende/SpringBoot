package com.Studentsdata.StudentsDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication

public class StudentsDetailsApplication implements CommandLineRunner {
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {

		SpringApplication.run(StudentsDetailsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.passwordEncoder.encode("harshad"));
	}
}
