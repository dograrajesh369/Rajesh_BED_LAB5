package com.gl.employeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeeManagementSystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
