package com.u2d.jpa.pocjpa.inheritance.singletable.repository;

import com.u2d.jpa.pocjpa.inheritance.singletable.entity.PersonSingle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonSingleRepository extends JpaRepository<PersonSingle, Long> {
}
