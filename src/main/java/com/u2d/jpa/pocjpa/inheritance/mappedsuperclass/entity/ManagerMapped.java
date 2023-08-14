package com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager_mapped")
public class ManagerMapped extends PersonMapped {
    @Column(name = "direction")
    private String direction;
}
