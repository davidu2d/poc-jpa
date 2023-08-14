package com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_mapped")
public class EmployeeMapped extends PersonMapped {
    @Column(name = "department")
    private String department;
}
