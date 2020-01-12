package com.reservation.ensi.model;


import javax.persistence.*;

import lombok.*;

import lombok.Data;

import javax.persistence.Entity;

import org.hibernate.annotations.DynamicUpdate;


@Data
@Entity
@DynamicUpdate
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
    private String prenom;
    private String mail;
    private long carte_bancaire;
    private long numero;

   
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getCarte_bancaire() {
		return carte_bancaire;
	}
	public void setCarte_bancaire(long carte_bancaire) {
		this.carte_bancaire = carte_bancaire;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	public User() {

    }
	
    public User(String nom, String prenom, String mail, long carte_bancaire, long numero) {
    		
    	  this.nom=nom;
    	  this.prenom=prenom;
    	  this.mail=mail;
    	  this.carte_bancaire=carte_bancaire;
    	  this.numero=numero;

    }
}
