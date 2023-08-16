package com.u2d.jpa.pocjpa.relationship.onetoone.jointable.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "workstation")
public class Workstation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonBackReference
    @OneToOne(mappedBy = "workstation") //mappedBy para indicar que a entidade employee que contem o atributo workstation é o owner do relacionamento
    private Employee employee; //necessario o mapeamento da outra entidade se for um relacionamento bidirecional
}
