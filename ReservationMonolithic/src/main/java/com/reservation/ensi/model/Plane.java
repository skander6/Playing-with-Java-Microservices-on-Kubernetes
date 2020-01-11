package com.reservation.ensi.model;


import lombok.Data;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String type;
    private boolean available;
    private int nbPlace;
    public Plane(){

    }
    public Plane(String type, boolean available, int nbPlace) {
        this.type=type;
        this.available=available;
        this.nbPlace=nbPlace;
    }

}
