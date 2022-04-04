package io.spring.employees.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.spring.employees.model.Employee;
import io.spring.employees.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Create Employee REST Endpoint
    @PostMapping //maps HTTP POST request onto specific handler method
    // annotation @RequestBody indicates that a method parameter should be bound to the body
    // of the web request. The body of the request is passed through an HttpMessageConverter
    // to resolve the method argument depending on the content type of the request.
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(
            this.employeeService.saveEmployee(employee), 
            HttpStatus.CREATED);
    }

    // Read All Employees REST Endpoint
    @GetMapping //maps HTTP GET request onto specific handler method
    public List<Employee> readAllEmployees(){
        return this.employeeService.getAllEmployees();
    }
    
    // Read Employee by ID REST Endpoint
    @GetMapping("{id}") //maps HTTP GET request onto specific handler method
    public ResponseEntity<Employee> readEmployeeById(@PathVariable("id") long id){
        return new ResponseEntity<Employee>(
            this.employeeService.getEmployeeById(id), 
            HttpStatus.OK);        
    }
}
