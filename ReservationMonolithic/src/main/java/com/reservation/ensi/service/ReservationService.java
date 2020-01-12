package com.reservation.ensi.service;

import com.reservation.ensi.DTO.ReservationDTO;
import com.reservation.ensi.model.Reservation;
import com.reservation.ensi.model.User;
import com.reservation.ensi.model.Vol;
import com.reservation.ensi.persistence.ReservationRepository;
import com.reservation.ensi.persistence.UserRepository;
import com.reservation.ensi.persistence.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private VolRepository volRepository;

    private Reservation reservation;

    public List<Reservation> getAllUserReservations(Long userId){
        return this.reservationRepository.findReservationsByUser(userId);
    }

    public Reservation createReservation(ReservationDTO reservationDTO, Long userId, Long volId){
        //User user = userRepository.getOne(userId);
        Vol vol = volRepository.getOne(volId);
        if(vol.getNbrePlaceDispo() > 0){
            vol.setNbrePlaceDispo(vol.getNbrePlaceDispo()-1);
            volRepository.save(vol);
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
