package com.ensi.logistic.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
    public Plane(Long id,String type) {
        this.id=id;
        this.type=type;

    }

}


