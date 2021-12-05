package com.greatLearning.springrest.repository;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatLearning.springrest.entity.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//	public List<Employee> findBAll();
//	public Employee findById(int id);
//	public void save(Employee employee);
//	public void deleteById(int id);
}
