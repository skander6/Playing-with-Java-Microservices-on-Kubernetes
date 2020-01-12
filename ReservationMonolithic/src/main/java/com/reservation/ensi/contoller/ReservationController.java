package com.reservation.ensi.contoller;

import com.reservation.ensi.DTO.ReservationDTO;
import com.reservation.ensi.model.Reservation;
import com.reservation.ensi.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/reservations/user/{userId}")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;


    @PostMapping("/vol/{volId}")
    public Reservation createReservation(@RequestBody ReservationDTO reservationDTO, @PathVariable Long userId, @PathVariable Long volId){
        return this.reservationService.createReservation(reservationDTO, userId, volId);
    }

    @GetMapping("/all")
    public List<Reservation> getAllUserReservations(@PathVariable Long userId){
        return this.reservationService.getAllUserReservations(userId);
    }

    @PutMapping("/pay/{reservationId}")
    public void payReservation(@PathVariable Long reservationId) {
        this.reservationService.pay(reservationId);
    }

    @DeleteMapping("/{reservationId}")
    public void deletePlane(@PathVariable String reservationId){
        this.reservationService.deleteById(Long.valueOf(reservationId));
    }
}
