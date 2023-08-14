package com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.controller;

import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.entity.EmployeeMapped;
import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.entity.ManagerMapped;
import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mappedsuperclass")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity craate(){
        EmployeeMapped employeeMapped = new EmployeeMapped();
        employeeMapped.setName("João");
        employeeMapped.setAge(20);

        ManagerMapped managerMapped = new ManagerMapped();
        managerMapped.setName("Jose");
        managerMapped.setAge(30);

        personService.save(employeeMapped);
        personService.save(managerMapped);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
