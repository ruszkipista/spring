package io.spring.employees.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// Lombok annotation for generating methods
@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
// the aboves are equivalent to @Data
public class Employee {
    private long id;
    private String lastName;
    private String firstName;
}
