package com.u2d.jpa.pocjpa.fetch.controller;

import com.u2d.jpa.pocjpa.fetch.service.ChampionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("liga")
public class ChampionsController {

    @Autowired
    private ChampionsService championsService;

    @GetMapping("/team/{id}")
    public ResponseEntity findTeam(@PathVariable Long id){
        var result = championsService.findTeamById(id);
        return result.isPresent() ? ResponseEntity.ok(result.get()) : ResponseEntity.noContent().build();
    }

    @GetMapping("/player/{id}")
    public ResponseEntity findPlayer(@PathVariable Long id){
        var result = championsService.findPlayerById(id);
        return result.isPresent() ? ResponseEntity.ok(result.get()) : ResponseEntity.noContent().build();
    }
}
