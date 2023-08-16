package com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "address_shared")
public class AddressShared {

    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "street")
    private String street;

    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId//indica que os valores da primary key serão copiados da entidade UsersShared
    @JoinColumn(name = "user_id")
    private UsersShared usersShared;//necessario o mapeamento da outra entidade se for um relacionamento bidirecional e primarykey shared
}
