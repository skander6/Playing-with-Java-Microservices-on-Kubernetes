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

    private Vol vol;



    public Vol getVolById(Long volId){
        //rest get
        Vol vol = restTemplate.getForObject("http://movie-info-service/movies/" + volId, Vol.class);
        return vol;
    }

    public void updateVol(Vol vol){
        // rest put
        restTemplate.put("http://movie-info-service/movies/",vol);
    }

}
