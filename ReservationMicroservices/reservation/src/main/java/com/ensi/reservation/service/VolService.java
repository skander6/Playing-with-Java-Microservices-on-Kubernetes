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



    public Vol getVolById(Long volId){
        //rest get
        vol = restTemplate.getForObject("http://logistic/api/voles/" + volId, Vol.class);
        System.out.println(vol);
        return vol;
    }

    public void updateVol(Long volId){
        // rest put
        restTemplate.put("http://logistic/api/voles/update/"+volId,null);
    }

}
