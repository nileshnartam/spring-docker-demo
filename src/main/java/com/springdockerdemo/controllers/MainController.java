package com.springdockerdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdockerdemo.entity.Employee;
import com.springdockerdemo.service.IEmployeeService;

@RestController
@RequestMapping(value="/data")
public class MainController {
	@Autowired
	private IEmployeeService empService;
	@GetMapping()
	public List<Employee> getDefaultData(){
		return empService.getDefaultEmpList();
	}
}
