package com.reservation.ensi.service;

import com.reservation.ensi.DTO.PlaneDTO;
import com.reservation.ensi.DTO.VolDTO;
import com.reservation.ensi.model.Plane;
import com.reservation.ensi.model.Vol;
import com.reservation.ensi.persistence.PlaneRepository;
import com.reservation.ensi.persistence.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VolService {

    @Autowired
    private VolRepository volRepository;
    @Autowired
    private PlaneRepository planeRepository;

    public List<Vol> findAll(){
        return this.volRepository.findAll();
    }

    public Vol create(VolDTO volDTO,Plane plane){
        return this.volRepository.save(
                new Vol( volDTO.getDepart(),volDTO.getArrive(), volDTO.getDateDepart(),volDTO.getdateArrive(),volDTO.getNbrePlaceDispo(),plane));
    }
    public void deleteById(Long id){
        this.volRepository.deleteById(id);
    }

    public void save(Vol vol) {
        volRepository.save(vol);
    }
    public  Plane findPlaneById(Long id) {
        return this.planeRepository.getOne(id);
    }

}


