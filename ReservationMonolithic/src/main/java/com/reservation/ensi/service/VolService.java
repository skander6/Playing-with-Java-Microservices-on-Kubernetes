package com.reservation.ensi.service;

import com.reservation.ensi.persistence.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VolService {
    @Autowired
    private VolRepository volRepository;

    public List<Vol> findAll(){
        return this.volRepository.findAll();
    }
}
