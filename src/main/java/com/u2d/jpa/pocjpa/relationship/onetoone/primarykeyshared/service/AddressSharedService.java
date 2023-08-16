package com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.service;

import com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.entity.AddressShared;
import com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.repository.AddressSharedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressSharedService {

    private final AddressSharedRepository addressSharedRepository;
    private final UserSharedService userSharedService;

    public AddressShared create(){
        var user = userSharedService.create();
        AddressShared address = new AddressShared();
        address.setStreet("rua 200");
        address.setUsersShared(user);
        return addressSharedRepository.save(address);
    }

    public List<AddressShared> findAll() {
        return addressSharedRepository.findAll();
    }
}
