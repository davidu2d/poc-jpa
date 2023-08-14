package com.u2d.jpa.pocjpa.inheritance.joinedtable.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class EmployeeJoined extends PersonJoined {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "department")
    private String department;
}
