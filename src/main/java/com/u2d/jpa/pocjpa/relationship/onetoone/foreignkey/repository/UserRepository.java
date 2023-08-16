package com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.repository;

import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
