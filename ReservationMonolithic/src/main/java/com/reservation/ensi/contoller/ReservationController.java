package com.reservation.ensi.contoller;

import com.reservation.ensi.DTO.ReservationDTO;
import com.reservation.ensi.model.Reservation;
import com.reservation.ensi.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/users/{id}/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;


    @PostMapping
    public Reservation create(@RequestBody ReservationDTO reservationDTO){
        return this.reservationService.create(reservationDTO);
    }

    @GetMapping("/all")
    public List<Reservation> findAll(){
        return this.reservationService.findAll();
    }

    @PutMapping("/pay")
    public void updateClient(@RequestBody Reservation reservation) {
        this.reservationService.create();

    }

    @DeleteMapping("/{id}")
    public void deletePlane(@PathVariable String id){
        this.planeService.deleteById(Long.valueOf(id));
    }
}
