package com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.controller;

import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.entity.Users;
import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("onetoone")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("foreingkey")
    public ResponseEntity create(){
        userService.create();
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("foreingkey")
    public ResponseEntity findAll(){
        var list = userService.findAll();
        return ResponseEntity.ok(list);
    }
}
