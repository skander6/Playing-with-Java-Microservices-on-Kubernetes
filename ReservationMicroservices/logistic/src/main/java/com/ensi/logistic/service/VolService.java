package com.ensi.logistic.service;
import com.ensi.logistic.persistence.PlaneRepository;
import com.ensi.logistic.persistence.VolRepository;

import com.ensi.logistic.DTO.VolDTO;
import com.ensi.logistic.model.Plane;
import com.ensi.logistic.model.Vol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VolService {

    @Autowired
    private VolRepository volRepository;

    public List<Vol> findAll(){
        return this.volRepository.findAll();
    }

    public Vol create(VolDTO volDTO, Long plane){
        return this.volRepository.save(
                new Vol( volDTO.getDepart(),volDTO.getArrive(), volDTO.getDateDepart(),volDTO.getDateArrive(), volDTO.getNbrePlaceDispo(), plane));
    }
    public void deleteById(Long id){
        this.volRepository.deleteById(id);
    }

    public void save(Vol vol) {
        volRepository.save(vol);
    }
}


