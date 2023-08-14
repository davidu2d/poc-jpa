package com.u2d.jpa.pocjpa.inheritance.tableperclass.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "manager_tableperclass")
public class ManagerTablePerClass extends PersonTablePerClass {
    @Column(name = "direction")
    private String direction;
}
