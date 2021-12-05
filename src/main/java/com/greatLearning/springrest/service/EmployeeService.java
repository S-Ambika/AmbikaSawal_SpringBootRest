package com.greatLearning.springrest.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.greatLearning.springrest.entity.Employee;

@Component
//@Bean
public interface EmployeeService {
	
	public List<Employee> findAll();
//	public Employee findById(int id);
	public void save(Employee employee);
	//public void deleteById(int id);


}
