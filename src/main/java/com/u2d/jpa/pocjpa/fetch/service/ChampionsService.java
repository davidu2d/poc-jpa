package com.u2d.jpa.pocjpa.fetch.service;

import com.u2d.jpa.pocjpa.fetch.entity.Player;
import com.u2d.jpa.pocjpa.fetch.entity.Team;

import java.util.Optional;

public interface ChampionsService {

    Optional<Team> findTeamById(Long id);

    Optional<Player> findPlayerById(Long id);
}
