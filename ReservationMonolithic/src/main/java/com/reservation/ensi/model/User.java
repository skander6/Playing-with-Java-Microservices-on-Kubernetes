package com.reservation.ensi.model;

import javax.persistence.*;

import lombok.*;

import lombok.Data;

import javax.persistence.Entity;


@Data
@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String Nom;
    private String Prenom;
    private String mail;
    private String carte_bancaire;
    private long numero;

   
    public User() {

    }
    public User(String Nom, String Prenom, String mail, String carte_bancaire, long numero) {
    	  this.Nom=Nom;
    	  this.Prenom=Prenom;
    	  this.mail=mail;
    	  this.carte_bancaire=carte_bancaire;
    	  this.numero=numero;

    }
}
