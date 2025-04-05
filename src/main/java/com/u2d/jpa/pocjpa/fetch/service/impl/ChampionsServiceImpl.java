package com.u2d.jpa.pocjpa.fetch.service.impl;

import com.u2d.jpa.pocjpa.fetch.entity.Player;
import com.u2d.jpa.pocjpa.fetch.entity.Team;
import com.u2d.jpa.pocjpa.fetch.repository.PlayerRepository;
import com.u2d.jpa.pocjpa.fetch.repository.TeamRepository;
import com.u2d.jpa.pocjpa.fetch.service.ChampionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChampionsServiceImpl implements ChampionsService {

    private TeamRepository teamRepository;
    private PlayerRepository playerRepository;

    @Autowired
    ChampionsServiceImpl(TeamRepository teamRepository, PlayerRepository playerRepository){
        this.teamRepository = teamRepository;
        this.playerRepository = playerRepository;
    }

    @Override
    public Optional<Team> findTeamById(Long id) {
        return teamRepository.findById(id);
    }

    @Override
    public Optional<Player> findPlayerById(Long id) {
        return playerRepository.findById(id);
    }
}
