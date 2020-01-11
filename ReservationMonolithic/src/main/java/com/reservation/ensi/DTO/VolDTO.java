package com.reservation.ensi.DTO;

import lombok.Data;

import java.util.Date;
@Data
public class VolDTO {
    private String depart;
    private String arrive;
    private Date date_depart;
    private Date date_arrive;
    private  Long nbre_place_dispo;
}
