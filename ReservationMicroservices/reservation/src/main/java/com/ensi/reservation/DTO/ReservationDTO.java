package com.ensi.reservation.DTO;



public class ReservationDTO {

    private Boolean paiment = false;
    private int placeNumber = 7;
    private Vol vol;
    private User user;

    public ReservationDTO() {
    }

    public Boolean getPaiment() {
        return paiment;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public Vol getVol() {
        return vol;
    }

    public User getUser() {
        return user;
    }

}


