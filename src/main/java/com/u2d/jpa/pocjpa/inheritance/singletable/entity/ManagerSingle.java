package com.u2d.jpa.pocjpa.inheritance.singletable.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("Manager")
public class ManagerSingle extends PersonSingle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "direction")
    private String direction;
}
