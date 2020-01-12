package com.reservation.ensi.DTO;

import com.reservation.ensi.model.Plane;
import lombok.Data;

import java.util.Date;

public class VolDTO {
    private String depart;
    private String arrive;
    private Date dateDepart;
    private Date dateArrive;
    private  Long nbrePlaceDispo;
    private Plane plane;

    public Date getDateArrive() {
        return dateArrive;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public  String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getdateArrive() {
        return dateArrive;
    }

    public void setDateArrive(Date dateArrive) {
        this.dateArrive = dateArrive;
    }

    public Long getNbrePlaceDispo() {
        return nbrePlaceDispo;
    }

    public void setNbrePlaceDispo(Long nbrePlaceDispo) {
        nbrePlaceDispo = nbrePlaceDispo;
    }

    public Plane getPlane() {
        return this.plane;
    }
}