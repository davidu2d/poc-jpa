package com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.service;

import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.entity.EmployeeMapped;
import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.entity.ManagerMapped;
import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.repository.EmployeeRepository;
import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.repository.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final EmployeeRepository employeeRepository;
    private final ManagerRepository managerRepository;

    public void save(EmployeeMapped employeeMapped){
        employeeRepository.save(employeeMapped);
    }

    public void save(ManagerMapped managerMapped){
        managerRepository.save(managerMapped);
    }

}
