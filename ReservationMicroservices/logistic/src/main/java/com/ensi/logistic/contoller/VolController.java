
package com.ensi.logistic.contoller;


import com.ensi.logistic.DTO.VolDTO;
import com.ensi.logistic.model.Plane;
import com.ensi.logistic.model.Vol;
import com.ensi.logistic.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/voles")
public class VolController {
    @Autowired
    private VolService volService;
    @PostMapping(value="/{planeId}",consumes = { MediaType.APPLICATION_JSON_VALUE}, produces = { MediaType.APPLICATION_JSON_VALUE})
    public Vol create(@RequestBody VolDTO volDTO, @PathVariable Long planeId){
        Plane plane= new Plane(planeId,"");
        volDTO.setPlane(plane);
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
    @GetMapping("/{id}")
    public void GetVol(@PathVariable String id){
        this.volService.findVolById(Long.valueOf(id));
    }

    @PutMapping("/updateNbPlace")
    public void updateNbPlace(@RequestBody Vol vol) {
        volService.updateNbPlace(vol);
        this.volService.save(vol);

    }

}
