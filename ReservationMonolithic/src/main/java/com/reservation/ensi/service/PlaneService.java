package com.reservation.ensi.service;


import com.reservation.ensi.DTO.PlaneDTO;
import com.reservation.ensi.model.Plane;
import com.reservation.ensi.persistence.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneService {
    @Autowired
    private PlaneRepository planeRepository;
    public List<Plane> findAll(){
        return this.planeRepository.findAll();
    }

    public Plane create(PlaneDTO planeDTO){
        return this.planeRepository.save(
                new Plane( planeDTO.getType(),planeDTO.isAvailable(), planeDTO.getNbPlace()));
    }

    public void save(Plane plane) {
        planeRepository.save(plane);
    }

    public void deleteById(Long id){
        this.planeRepository.deleteById(id);
    }

}
