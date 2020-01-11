package com.reservation.ensi.service;


import com.reservation.ensi.model.Avion;
import com.reservation.ensi.persistence.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvionService {
    @Autowired
    private AvionRepository AvionRepository;

    public List<Avion> findAll(){
        return this.AvionRepository.findAll();
    }



}
