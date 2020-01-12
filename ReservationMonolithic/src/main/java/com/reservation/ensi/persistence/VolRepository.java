package com.reservation.ensi.persistence;

import com.reservation.ensi.model.Reservation;
import com.reservation.ensi.model.Vol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolRepository extends JpaRepository<Vol, Long> {
}

