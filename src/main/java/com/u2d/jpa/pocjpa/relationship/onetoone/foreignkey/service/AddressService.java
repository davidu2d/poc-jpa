package com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.service;

import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.entity.Address;
import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;

    public Address create(){
        Address address = new Address();
        address.setStreet("rua 200");
        return addressRepository.save(address);
    }
}
