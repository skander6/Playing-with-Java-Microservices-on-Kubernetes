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
    private Date dateDepart;
    private Date dateArrive;
    private Long nbrePlaceDispo;
    private Long plane;

    public Vol(){

    }

    public Vol(String depart,String arrive,Date dateDepart,Date dateArrive,Long nbrePlaceDispo, Long plane){
        this.depart=depart;
        this.arrive=arrive;
        this.dateDepart=dateDepart;
        this.dateArrive=dateArrive;
        this.nbrePlaceDispo=nbrePlaceDispo;
        this.plane=plane;

    }

    public Long getNbrePlaceDispo() {
        return nbrePlaceDispo;
    }

    public void setNbrePlaceDispo(Long nbrePlaceDispo) {
        this.nbrePlaceDispo = nbrePlaceDispo;
    }
}

