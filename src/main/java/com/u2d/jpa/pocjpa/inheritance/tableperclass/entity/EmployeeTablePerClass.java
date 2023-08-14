package com.u2d.jpa.pocjpa.inheritance.tableperclass.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employee_tableperclass")
public class EmployeeTablePerClass extends PersonTablePerClass {
    @Column(name = "department")
    private String department;
}
