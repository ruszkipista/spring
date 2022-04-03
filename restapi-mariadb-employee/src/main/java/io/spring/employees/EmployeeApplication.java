package io.spring.employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.spring.employees.model.Employee;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);

		Employee employee = new Employee(42L, "Ruszki", "Pista","rp@email.org");
		System.out.println(employee);
	}

}
