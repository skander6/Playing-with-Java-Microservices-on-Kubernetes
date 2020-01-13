package com.ensi.reservation.service;

import com.ensi.reservation.model.Vol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class VolService {

    @Autowired
    private RestTemplate restTemplate;

    private Vol vol = new Vol();



    public void getVolById(Long volId){
        //rest get
        System.out.println(restTemplate.getForObject("http://localhost:8081/api/voles/" + volId,Vol.class));
        System.out.println(vol);

    }

    public void updateVol(Vol vol){
        // rest put
        restTemplate.put("http://localhost:8081/api/voles/update",vol);
    }

}
