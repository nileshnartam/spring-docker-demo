package com.springdockerdemo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springdockerdemo.entity.Address;
import com.springdockerdemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	private List<Employee> defaultEmpList;
	@Override
	public List<Employee> getDefaultEmpList() {
		return defaultEmpList;
	}

	public void setDefaultEmpList(List<Employee> defaultEmpList) {
		this.defaultEmpList = defaultEmpList;
	}
	@Override
	public void initDefaultEmpList() {
		this.defaultEmpList = Arrays.asList(
				 new Employee("nilesh", "nartam", "software engineer", new Address("d1-602", "pranik aldea", "pune", "maharashtra", "410045")),
				 new Employee("komal", "dudhbade", "bank consultant", new Address("d1-602", "pranik aldea", "pune", "maharashtra", "410045"))
				);
	}
	
}
