package com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.repository;

import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
