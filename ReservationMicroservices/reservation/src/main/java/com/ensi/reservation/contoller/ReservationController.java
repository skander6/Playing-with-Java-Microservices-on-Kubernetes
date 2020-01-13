package com.ensi.reservation.contoller;

import com.ensi.reservation.model.Reservation;
import com.ensi.reservation.DTO.ReservationDTO;
import com.ensi.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8081","http://localhost:8083"})
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
