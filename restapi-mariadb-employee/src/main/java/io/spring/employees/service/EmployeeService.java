package io.spring.employees.service;

import java.util.List;

import io.spring.employees.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee modifyEmployeeById(Employee employee, long id);
    void removeEmployeeById(long id);
}
