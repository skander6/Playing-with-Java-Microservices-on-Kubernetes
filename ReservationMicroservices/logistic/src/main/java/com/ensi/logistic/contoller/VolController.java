
package com.ensi.logistic.contoller;


import com.ensi.logistic.DTO.VolDTO;
import com.ensi.logistic.model.Plane;
import com.ensi.logistic.model.Vol;
import com.ensi.logistic.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = {"http://localhost:8082","http://localhost:8083"})
@RestController
@RequestMapping("/api/voles")
public class VolController {

    @Autowired
    private VolService volService;

    @PostMapping("/{planeId}")
    public Vol create(@RequestBody VolDTO volDTO, @PathVariable Long planeId){
        return this.volService.create(volDTO, planeId);
    }

    @GetMapping("/all")
    public List<Vol> findAll(){
        return this.volService.findAll();
    }

//    @PutMapping("/update")
//    public void updateVol(@RequestBody Vol vol) {
//        this.volService.save(vol);
//
//    }

    @DeleteMapping("/{id}")
    public void deleteVol(@PathVariable String id){
        this.volService.deleteById(Long.valueOf(id));
    }

    @GetMapping("/{id}")
    public Vol GetVol(@PathVariable Long id){
        return this.volService.findVolById(id);
    }

    @PutMapping("/update/{volId}")
    public void updateNbPlace(@PathVariable Long volId) {
        volService.updateNbPlace(volId);
    }

}
