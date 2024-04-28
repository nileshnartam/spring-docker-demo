package com.springdockerdemo.service;

import java.util.List;

import com.springdockerdemo.entity.Employee;

public interface IEmployeeService {
	List<Employee> getDefaultEmpList();
	void initDefaultEmpList();
}
