package com.ensi.reservation.contoller;

import com.ensi.reservation.model.Reservation;
import com.reservation.ensi.DTO.ReservationDTO;
import com.reservation.ensi.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/users/{userId}/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;


    @PostMapping("/vol/{volId}")
    public Reservation createReservation(@RequestBody ReservationDTO reservationDTO, @PathVariable Long userId, @PathVariable Long volId){
        return this.reservationService.createReservation(reservationDTO, userId, volId);
    }

    @GetMapping("/all")
    public List<Reservation> getAllReservation(){
        return this.reservationService.getAllReservation();
    }

    @PutMapping("/{reservationId}/pay")
    public void payReservation(@PathVariable Long reservationId) {
        this.reservationService.pay(reservationId);
    }

    @DeleteMapping("/{reservationId}")
    public void deletePlane(@PathVariable String reservationId){
        this.reservationService.deleteById(Long.valueOf(reservationId));
    }
}
