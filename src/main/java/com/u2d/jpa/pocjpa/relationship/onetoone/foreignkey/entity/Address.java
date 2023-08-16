package com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    private String street;

    @JsonBackReference
    @OneToOne(mappedBy = "address") //mappedBy para indicar que a entidade user que contem o atributo address é o owner do relacionamento
    private Users users;//necessario o mapeamento da outra entidade se for um relacionamento bidirecional
}
