package com.greatLearning.springrest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatLearning.springrest.entity.Employee;
import com.greatLearning.springrest.repository.EmployeeRepository;
import com.greatLearning.springrest.service.EmployeeService;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
//@Transactional

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeDAO;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

//	@Override
//	public Employee findById(Integer id) {
//		// TODO Auto-generated method stub
//		return employeeDAO.findById(id);
//	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.save(employee);

	}
//
//	@Override
//	public void deleteById(int id) {
//		// TODO Auto-generated method stub
//		employeeDAO.deleteById(id);
//
//	}

}
