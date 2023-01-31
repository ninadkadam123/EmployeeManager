package com.app.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

	void deleteEmployeeById(Long id);

	Optional<Employee> findEmployeeById(Long id);

	
}
