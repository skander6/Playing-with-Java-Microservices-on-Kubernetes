package com.reservation.ensi.DTO;


public class UserDTO {

    private String nom;
    private String prenom;
    private String mail;
    private long carte_bancaire;
    private long numero;

    public UserDTO() {
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public long getCarte_bancaire() {
        return carte_bancaire;
    }

    public long getNumero() {
        return numero;
    }

 


}
