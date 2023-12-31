package com.u2d.jpa.pocjpa.relationship.onetoone.jointable.service;

import com.u2d.jpa.pocjpa.relationship.onetoone.jointable.entity.Employee;
import com.u2d.jpa.pocjpa.relationship.onetoone.jointable.entity.Workstation;
import com.u2d.jpa.pocjpa.relationship.onetoone.jointable.repository.Employee2Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final Employee2Repository employee2Repository;

    public Employee create(){
        Workstation workstation = new Workstation();
        workstation.setName("baia 1");

        Employee employee = new Employee();
        employee.setName("david");
        employee.setWorkstation(workstation);
        return employee2Repository.save(employee);
    }

    public List<Employee> findAll() {
        return employee2Repository.findAll();
    }
}
