package com.u2d.jpa.pocjpa.fetch.repository;

import com.u2d.jpa.pocjpa.fetch.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
