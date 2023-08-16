package com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.service;

import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.entity.Users;
import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final AddressService addressService;

    public Users create(){
        var address = addressService.create();
        Users u = new Users();
        u.setName("davi");
        u.setAddress(address);
        return userRepository.save(u);
    }

    public List<Users> findAll(){
        return userRepository.findAll();
    }
}
