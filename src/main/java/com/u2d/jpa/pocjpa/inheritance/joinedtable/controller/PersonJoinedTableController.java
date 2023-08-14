package com.u2d.jpa.pocjpa.inheritance.joinedtable.controller;

import com.u2d.jpa.pocjpa.inheritance.joinedtable.entity.EmployeeJoined;
import com.u2d.jpa.pocjpa.inheritance.joinedtable.entity.ManagerJoined;
import com.u2d.jpa.pocjpa.inheritance.joinedtable.service.PersonJoinedTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("joinedtable")
@RequiredArgsConstructor
public class PersonJoinedTableController {

    private final PersonJoinedTableService service;

    @PostMapping
    public ResponseEntity craate(){
        EmployeeJoined employeeJoined = new EmployeeJoined();
        employeeJoined.setName("João");
        employeeJoined.setAge(30);
        employeeJoined.setDepartment("caixa");

        ManagerJoined managerJoined = new ManagerJoined();
        managerJoined.setName("Jose");
        managerJoined.setAge(20);
        managerJoined.setDirection("ti");

        service.save(employeeJoined);
        service.save(managerJoined);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
