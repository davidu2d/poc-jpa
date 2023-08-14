package com.u2d.jpa.pocjpa.inheritance.joinedtable.repository;

import com.u2d.jpa.pocjpa.inheritance.joinedtable.entity.PersonJoined;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonJoinedRepository extends JpaRepository<PersonJoined, Long> {
}
