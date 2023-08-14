package com.u2d.jpa.pocjpa.inheritance.tableperclass.repository;

import com.u2d.jpa.pocjpa.inheritance.tableperclass.entity.ManagerTablePerClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerTablePerClassRepository extends JpaRepository<ManagerTablePerClass, Long> {
}
