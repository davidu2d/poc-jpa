package com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.service;

import com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.entity.UsersShared;
import com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.repository.UserSharedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserSharedService {

    private final UserSharedRepository userSharedRepository;

    public UsersShared create(){
        UsersShared u = new UsersShared();
        u.setName("davi");
        return userSharedRepository.save(u);
    }

    public List<UsersShared> findAll(){
        return userSharedRepository.findAll();
    }
}
