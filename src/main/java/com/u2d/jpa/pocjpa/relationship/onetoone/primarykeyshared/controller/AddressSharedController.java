package com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.controller;

import com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.service.AddressSharedService;
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
public class AddressSharedController {

    private final AddressSharedService addressSharedService;

    @PostMapping("primarykeyshared")
    public ResponseEntity create(){
        addressSharedService.create();
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("primarykeyshared")
    public ResponseEntity findAll(){
        var list = addressSharedService.findAll();
        return ResponseEntity.ok(list);
    }
}
