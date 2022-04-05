package io.spring.employees.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Objects;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // Lombok: generate a constructor with all attributes
@NoArgsConstructor  // Lombok: generate a constructor without parameters
@Data // Lombok: equivalent to @Setter @Getter @EqualsAndHashCode @ToString
@Entity // Persistence: specifies that the class is an entity
@Table(name="employees") // Persistence: assign entity to DB table name
public class Employee implements Cloneable{

    @Id // Persistence: ID attribute acts as primary key in the DB table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Persistence: how to fill at CREATE
    private long id;

    @Column(name = "last_name") // Persistence: assign DB table name
    private String lastName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "email")
    private String email;
}
