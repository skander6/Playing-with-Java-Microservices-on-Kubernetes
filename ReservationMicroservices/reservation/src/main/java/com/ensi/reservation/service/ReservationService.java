package com.ensi.reservation.service;

import com.ensi.reservation.DTO.ReservationDTO;
import com.ensi.reservation.model.Reservation;
import com.ensi.reservation.model.Vol;
import com.ensi.reservation.persistence.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private VolService volService;

    private Reservation reservation;

    private Vol vol = new Vol();

    public List<Reservation> getAllUserReservations(Long userId){
        return this.reservationRepository.findReservationsByUser(userId);
    }

    public Reservation createReservation(ReservationDTO reservationDTO, Long userId, Long volId){
        vol = volService.getVolById(volId);
        if(vol.getNbrePlaceDispo() > 0){
            vol.setNbrePlaceDispo(vol.getNbrePlaceDispo()-1);
            volService.updateVol(volId);
            return this.reservationRepository.save(
                    new Reservation(userId, volId, reservationDTO.getPlaceNumber()));
        }

        else {
            throw new IllegalArgumentException("NO PLACE AVAILABLE");
        }
    }

    public void deleteById(Long id){
        this.reservationRepository.deleteById(id);
    }

    public void pay(Long id) {
        reservation = reservationRepository.getOne(id);
        reservation.setPaiment(true);
        reservationRepository.save(reservation);
    }

}
