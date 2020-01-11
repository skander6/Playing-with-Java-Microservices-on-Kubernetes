package com.reservation.ensi.model;


import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String depart;
    private String arrive;
    private Date date_depart;
    private Date date_arrive;
    private  Long nbre_place_dispo;
    @OneToOne
    private Plane plane;

    public Vol(){

    }
    public Vol(String depart,String arrive,Date date_depart,Date date_arrive,Long nbre_place_dispo){
        this.depart=depart;
        this.arrive=arrive;
        this.date_arrive=date_arrive;
        this.nbre_place_dispo=nbre_place_dispo;
    }
}
