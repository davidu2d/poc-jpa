package com.u2d.jpa.pocjpa.relationship.onetoone.jointable.controller;

import com.u2d.jpa.pocjpa.relationship.onetoone.jointable.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("onetoone")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("jointable")
    public ResponseEntity create(){
        var employee = employeeService.create();
        return ResponseEntity.status(HttpStatus.CREATED).body(employee);
    }

    @GetMapping("jointable")
    public ResponseEntity findAll(){
        var list = employeeService.findAll();
        return ResponseEntity.ok(list);
    }
}
