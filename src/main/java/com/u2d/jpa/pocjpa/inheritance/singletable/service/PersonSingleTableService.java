package com.u2d.jpa.pocjpa.inheritance.singletable.service;

import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.entity.EmployeeMapped;
import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.entity.ManagerMapped;
import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.repository.EmployeeRepository;
import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.repository.ManagerRepository;
import com.u2d.jpa.pocjpa.inheritance.singletable.entity.PersonSingle;
import com.u2d.jpa.pocjpa.inheritance.singletable.repository.PersonSingleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonSingleTableService {
    private final PersonSingleRepository personSingleRepository;

    public void save(PersonSingle personSingle){
        personSingleRepository.save(personSingle);
    }
}
