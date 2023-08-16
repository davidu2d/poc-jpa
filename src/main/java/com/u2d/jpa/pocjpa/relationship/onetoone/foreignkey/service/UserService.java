package com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.service;

import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.entity.Address;
import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.entity.Users;
import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Users create(){
        Address address = new Address();
        address.setStreet("rua 200");

        Users u = new Users();
        u.setName("davi");
        u.setAddress(address);
        return userRepository.save(u);
    }

    public List<Users> findAll(){
        return userRepository.findAll();
    }
}
