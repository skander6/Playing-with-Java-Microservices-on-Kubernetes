
package com.ensi.logistic.contoller;


import com.ensi.logistic.model.Plane;
import com.ensi.logistic.service.PlaneService;
import com.reservation.ensi.DTO.PlaneDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8082","http://localhost:8083"})
@RestController
@RequestMapping("/api/planes")
public class PlaneController {
    @Autowired
    private PlaneService planeService;

    @PostMapping
    public Plane create(@RequestBody PlaneDTO planeDTO){
        return this.planeService.create(planeDTO);
    }

    @GetMapping("/all")
    public List<Plane> findAll(){
        return this.planeService.findAll();
    }

    @PutMapping("/update")
    public void updateClient(@RequestBody Plane plane) {
        this.planeService.save(plane);

    }

    @DeleteMapping("/{id}")
    public void deletePlane(@PathVariable String id){
        this.planeService.deleteById(Long.valueOf(id));
    }

}
