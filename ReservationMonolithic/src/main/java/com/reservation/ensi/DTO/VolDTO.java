package com.reservation.ensi.DTO;

import lombok.Data;

import java.util.Date;

public class VolDTO {
    private String depart;
    private String arrive;
    private Date dateDepart;
    private Date dateArrive;
    private  Long nbrePlaceDispo;

    public String getDepart() {
        return depart;
    }

    public  String getArrive() {
        return arrive;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public Date getDateArrive() {
        return dateArrive;
    }

    public Long getNbrePlaceDispo() {
        return nbrePlaceDispo;
    }

}


