package com.reservation.ensi.contoller;

import com.reservation.ensi.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/users/{id}/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    
}
