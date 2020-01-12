
package com.reservation.ensi.contoller;


import com.reservation.ensi.DTO.VolDTO;
import com.reservation.ensi.model.Plane;
import com.reservation.ensi.model.Vol;
import com.reservation.ensi.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voles")
public class VolController {
    @Autowired
    private VolService volService;
    @PostMapping
    public Vol create(@RequestBody VolDTO volDTO){
        return this.volService.create(volDTO);
    }
    @GetMapping("/all")
    public List<Vol> findAll(){
        return this.volService.findAll();
    }
    @PutMapping("/update")
    public void updateVol(@RequestBody Vol vol) {
        this.volService.save(vol);

    }
    @DeleteMapping("/{id}")
    public void deleteVol(@PathVariable String id){
        this.volService.deleteById(Long.valueOf(id));
    }

}
