package io.spring.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.spring.employees.model.Employee;

// @Repository - no need to add here
// @Transactional - no need to add here
public interface EmployeeRepository extends JpaRepository<Employee ,Long>{
}
