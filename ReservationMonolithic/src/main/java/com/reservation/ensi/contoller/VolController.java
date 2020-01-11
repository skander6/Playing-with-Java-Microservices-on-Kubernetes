package com.reservation.ensi.contoller;


import com.reservation.ensi.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vols")
public class VolController {
    @Autowired
    private VolService volService;

}
