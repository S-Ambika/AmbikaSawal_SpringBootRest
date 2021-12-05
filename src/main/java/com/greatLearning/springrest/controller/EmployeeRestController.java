package com.greatLearning.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatLearning.springrest.entity.Employee;
import com.greatLearning.springrest.service.EmployeeService;
import com.greatLearning.springrest.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	@Autowired

	private EmployeeServiceImpl employeeService;

	@GetMapping("/employees/")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}
//	@GetMapping("/employees/{employeeId}")
//	public Employee getEmployee()

}
