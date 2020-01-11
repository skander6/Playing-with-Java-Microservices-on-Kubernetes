package com.reservation.ensi.service;

import com.reservation.ensi.DTO.ReservationDTO;
import com.reservation.ensi.model.Reservation;
import com.reservation.ensi.persistence.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> findAll(){
        return this.reservationRepository.findAll();
    }

    public Reservation create(ReservationDTO reservationDTO){
        if(reservationDTO.getVol().getNbrPlaceDispo().compareTo(BigDecimal.ZERO)>0){
            return this.reservationRepository.save(
                    new Reservation(reservationDTO.getUser(), reservationDTO.getVol(), reservationDTO.getPlaceNumber()));
        }

        else {
            throw new IllegalArgumentException("NO PLACE AVAILABLE");
        }
    }

    public void deleteById(Long id){
        this.reservationRepository.deleteById(id);
    }

}
