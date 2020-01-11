package com.reservation.ensi.contoller;


import com.reservation.ensi.DTO.VolDTO;
import com.reservation.ensi.model.Vol;
import com.reservation.ensi.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/voles")
public class VolController {
    @Autowired
    private VolService volService;
    @PostMapping
    public Vol create(@RequestBody VolDTO volDTO){
        return this.volService.create(volDTO);
    }

}
