package com.u2d.jpa.pocjpa.inheritance.tableperclass.service;

import com.u2d.jpa.pocjpa.inheritance.tableperclass.entity.EmployeeTablePerClass;
import com.u2d.jpa.pocjpa.inheritance.tableperclass.entity.ManagerTablePerClass;
import com.u2d.jpa.pocjpa.inheritance.tableperclass.entity.PersonTablePerClass;
import com.u2d.jpa.pocjpa.inheritance.tableperclass.repository.EmployeeTablePerClassRepository;
import com.u2d.jpa.pocjpa.inheritance.tableperclass.repository.ManagerTablePerClassRepository;
import com.u2d.jpa.pocjpa.inheritance.tableperclass.repository.PersonTablePerClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonTablePerClassService {
    private final ManagerTablePerClassRepository managerTablePerClassRepository;
    private final EmployeeTablePerClassRepository employeeTablePerClassRepository;
    private final PersonTablePerClassRepository personTablePerClassRepository;

    public void save(ManagerTablePerClass managerTablePerClass){
        managerTablePerClassRepository.save(managerTablePerClass);
    }

    public void save(EmployeeTablePerClass employeeTablePerClass){
        employeeTablePerClassRepository.save(employeeTablePerClass);
    }

    public List<PersonTablePerClass> findAll() {
        return personTablePerClassRepository.findAll();
    }
}
