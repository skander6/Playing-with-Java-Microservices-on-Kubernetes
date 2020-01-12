package com.reservation.ensi.DTO;

import com.reservation.ensi.model.User;
import com.reservation.ensi.model.Vol;

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


