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
<<<<<<< HEAD
    private  Long nbrePlaceDispo;
    @ManyToOne
=======
    private Long nbrePlaceDispo;
    @OneToOne
>>>>>>> bf42036a33ec45d3f3c49fac84d65954655a8157
    private Plane plane;

    public Vol(){

    }
    public Vol(String depart,String arrive,Date dateDepart,Date dateArrive,Long nbrePlaceDispo){
        this.depart=depart;
        this.arrive=arrive;
        this.dateArrive=dateArrive;
        this.nbrePlaceDispo=nbrePlaceDispo;
       
    }

    public Long getNbrePlaceDispo() {
        return nbrePlaceDispo;
    }

    public void setNbrePlaceDispo(Long nbrePlaceDispo) {
        this.nbrePlaceDispo = nbrePlaceDispo;
    }
}

