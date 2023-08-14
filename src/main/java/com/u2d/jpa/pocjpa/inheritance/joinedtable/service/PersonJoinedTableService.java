package com.u2d.jpa.pocjpa.inheritance.joinedtable.service;

import com.u2d.jpa.pocjpa.inheritance.joinedtable.entity.PersonJoined;
import com.u2d.jpa.pocjpa.inheritance.joinedtable.repository.PersonJoinedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonJoinedTableService {
    private final PersonJoinedRepository personJoinedRepository;

    public void save(PersonJoined personJoined){
        personJoinedRepository.save(personJoined);
    }
}
