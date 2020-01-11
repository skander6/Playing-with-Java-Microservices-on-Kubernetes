package com.reservation.ensi.DTO;

public class PlaneDTO {
    private String type;
    private boolean available;
    private int nbPlace;

    public PlaneDTO() {
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getNbPlace() {
        return nbPlace;
    }
}
