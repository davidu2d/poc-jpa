package com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users_shared")
public class UsersShared {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonBackReference
    @OneToOne(mappedBy = "usersShared", cascade = CascadeType.ALL) //mappedBy indica que a entidade addressShared que contem o atributo usersShared é o owner do relacionamento e contem a foreignkey
    @PrimaryKeyJoinColumn //indica que a primarykey da entidade UsersShared é usada como valor da foreignkey para a entidade AddressShared associada
    private AddressShared addressShared;
}
