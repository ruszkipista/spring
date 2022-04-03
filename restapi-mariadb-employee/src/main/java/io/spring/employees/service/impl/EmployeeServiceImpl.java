package io.spring.employees.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import io.spring.employees.model.Employee;
import io.spring.employees.repository.EmployeeRepository;
import io.spring.employees.service.EmployeeService;

//Service: an operation offered as an interface that
// - stands alone in the model
// - has no encapsulated state
@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    private EmployeeRepository employeeRepository;

    //@Autowired - can be omitted, because this class has only one constructor
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }
    
}
