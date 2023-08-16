package com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.repository;

import com.u2d.jpa.pocjpa.relationship.onetoone.foreignkey.entity.Address;
import com.u2d.jpa.pocjpa.relationship.onetoone.primarykeyshared.entity.AddressShared;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressSharedRepository extends JpaRepository<AddressShared, Long> {
}
