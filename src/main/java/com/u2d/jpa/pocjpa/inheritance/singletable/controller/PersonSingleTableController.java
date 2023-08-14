package com.u2d.jpa.pocjpa.inheritance.singletable.controller;

import com.u2d.jpa.pocjpa.inheritance.singletable.entity.EmployeeSingle;
import com.u2d.jpa.pocjpa.inheritance.singletable.entity.ManagerSingle;
import com.u2d.jpa.pocjpa.inheritance.singletable.service.PersonSingleTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sigletable")
@RequiredArgsConstructor
public class PersonSingleTableController {

    private final PersonSingleTableService service;

    @PostMapping
    public ResponseEntity craate(){
        EmployeeSingle employeeSingle = new EmployeeSingle();
        employeeSingle.setName("João");
        employeeSingle.setAge(30);
        employeeSingle.setDepartment("caixa");

        ManagerSingle managerSingle = new ManagerSingle();
        managerSingle.setName("Jose");
        managerSingle.setAge(20);
        managerSingle.setDirection("ti");

        service.save(employeeSingle);
        service.save(managerSingle);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
