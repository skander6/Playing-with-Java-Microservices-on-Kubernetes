package com.ensi.reservation.DTO;



public class ReservationDTO {

    private Boolean paiment = false;
    private int placeNumber = 7;
    private Long vol;
    private Long user;

    public ReservationDTO() {
    }

    public Boolean getPaiment() {
        return paiment;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public Long getVol() {
        return vol;
    }

    public Long getUser() {
        return user;
    }

}


