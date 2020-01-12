package com.reservation.ensi.DTO;

import com.reservation.ensi.model.User;
import com.reservation.ensi.model.Vol;

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

    public void setPaiment(Boolean paiment) {
        this.paiment = paiment;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


