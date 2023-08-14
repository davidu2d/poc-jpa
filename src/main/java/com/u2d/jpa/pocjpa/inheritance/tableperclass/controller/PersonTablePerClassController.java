package com.u2d.jpa.pocjpa.inheritance.tableperclass.controller;

import com.u2d.jpa.pocjpa.inheritance.joinedtable.entity.EmployeeJoined;
import com.u2d.jpa.pocjpa.inheritance.joinedtable.entity.ManagerJoined;
import com.u2d.jpa.pocjpa.inheritance.joinedtable.service.PersonJoinedTableService;
import com.u2d.jpa.pocjpa.inheritance.tableperclass.entity.EmployeeTablePerClass;
import com.u2d.jpa.pocjpa.inheritance.tableperclass.entity.ManagerTablePerClass;
import com.u2d.jpa.pocjpa.inheritance.tableperclass.service.PersonTablePerClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tableperclass")
@RequiredArgsConstructor
public class PersonTablePerClassController {

    private final PersonTablePerClassService service;

    @PostMapping
    public ResponseEntity craate(){
        EmployeeTablePerClass employeeTablePerClass = new EmployeeTablePerClass();
        employeeTablePerClass.setName("João");
        employeeTablePerClass.setAge(30);
        employeeTablePerClass.setDepartment("caixa");

        ManagerTablePerClass managerTablePerClass = new ManagerTablePerClass();
        managerTablePerClass.setName("Jose");
        managerTablePerClass.setAge(20);
        managerTablePerClass.setDirection("ti");

        service.save(employeeTablePerClass);
        service.save(managerTablePerClass);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity findAll(){
        var list = service.findAll();
        return ResponseEntity.ok(list);
    }
}
