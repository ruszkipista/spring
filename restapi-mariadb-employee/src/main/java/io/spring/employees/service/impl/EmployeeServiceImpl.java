package io.spring.employees.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.spring.employees.exception.ResourceNotFoundException;
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

    @Override
    public Employee getEmployeeById(long id) {
        // Optional<Employee> employee = this.employeeRepository.findById(id);
        // if (employee.isPresent()){
        //     return employee.get();
        // } else {
        //     throw new ResourceNotFoundException("Employee", "id", id);
        // }
        return this.employeeRepository.findById(id).orElseThrow(() -> 
                new ResourceNotFoundException("Employee", "id", id));
    }

    @Override
    public Employee modifyEmployeeById(Employee employee, long id) {
        this.employeeRepository.findById(id).orElseThrow(() -> 
                new ResourceNotFoundException("Employee", "id", id));
        // employee exists in DB
        employee.setId(id);
        return this.employeeRepository.save(employee);
    }

    @Override
    public void removeEmployeeById(long id) {
        this.employeeRepository.findById(id).orElseThrow(() -> 
                new ResourceNotFoundException("Employee", "id", id));
        // employee exists in DB
        this.employeeRepository.deleteById(id);
    }
    
}
