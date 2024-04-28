package com.springdockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springdockerdemo.service.IEmployeeService;

@SpringBootApplication
public class SpringDockerDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDemoApplication.class, args);
	}
	
	@Autowired
	private IEmployeeService empService;

	@Override
	public void run(String... args) throws Exception {
		empService.initDefaultEmpList();
	}
	
}
