package com.reservation.ensi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Reservation {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private Boolean paiment = false;
        private int placeNumber;
        @OneToOne
        private Vol vol;
        @OneToOne
        private User user;

        public Reservation () {}
        public Reservation(User user, Vol vol, int placeNumber ) {
            this.user=user;
            this.vol=vol;
            this.placeNumber=placeNumber;
        }

    public void setPaiment(Boolean paiment) {
        this.paiment = paiment;
    }
}
