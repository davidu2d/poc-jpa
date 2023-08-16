package com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.repository;

import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.entity.Users;
import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.repository.UserRepository;
import com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.entity.UsersShared;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSharedRepository extends JpaRepository<UsersShared, Long> {
}
