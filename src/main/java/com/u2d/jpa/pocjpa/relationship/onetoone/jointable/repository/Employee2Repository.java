package com.u2d.jpa.pocjpa.relationship.onetoone.jointable.repository;

import com.u2d.jpa.pocjpa.relationship.onetoone.jointable.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee2Repository extends JpaRepository<Employee, Long> {
}
