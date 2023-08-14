package com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.repository;

import com.u2d.jpa.pocjpa.inheritance.mappedsuperclass.entity.ManagerMapped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<ManagerMapped, Long> {
}
