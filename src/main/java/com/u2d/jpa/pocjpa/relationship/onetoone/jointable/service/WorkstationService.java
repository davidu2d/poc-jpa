package com.u2d.jpa.pocjpa.relationship.onetoone.jointable.service;

import com.u2d.jpa.pocjpa.relationship.onetoone.jointable.entity.Workstation;
import com.u2d.jpa.pocjpa.relationship.onetoone.jointable.repository.WorkstationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkstationService {
    private final WorkstationRepository workstationRepository;

    public Workstation create(){
        Workstation workstation = new Workstation();
        workstation.setName("baia 1");
        return workstationRepository.save(workstation);
    }
}
