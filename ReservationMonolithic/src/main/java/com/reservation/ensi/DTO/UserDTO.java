package com.reservation.ensi.DTO;


public class UserDTO {
	
	   private String Nom;
	   private String Prenom;
	   private String mail;
	   private String carte_bancaire;
	   private long numero;

	   public UserDTO() {
	   }   

 public String getNom() {
     return Nom;
 }
 public String getPrenom() {
     return Prenom;
 }
 public String getmail() {
     return mail;
 }
 public String getcarte_bancaire() {
     return carte_bancaire;
 }
 public long getnumero() {
     return numero;
 }

 


}
