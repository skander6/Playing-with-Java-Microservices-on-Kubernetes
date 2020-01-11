package com.reservation.ensi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Reservation {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private Boolean paiment = false;

        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long placeNumber;
        private Vol vol;
        private User user;


        public Reservation(User user, Vol vol,  ) {
            this.user=user;
            this.vol=vol;
        }
    }
}
