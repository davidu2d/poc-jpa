package com.u2d.jpa.pocjpa.inheritance.singletable.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("Employee")
public class EmployeeSingle extends PersonSingle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "department")
    private String department;
}
