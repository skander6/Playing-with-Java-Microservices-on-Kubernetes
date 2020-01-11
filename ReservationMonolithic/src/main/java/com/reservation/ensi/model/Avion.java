package com.reservation.ensi.model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Id;
@Data
@Entity
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String Type;
    private Boolean disponible;
    private Long nbre_places_dispo;

    public Avion() {
    }
    public Avion(String Type, Long nbre_places_dispo,Boolean disponible){
        this.Type=Type;
        this.nbre_places_dispo=nbre_places_dispo;
        this.disponible=disponible;
    }
}
