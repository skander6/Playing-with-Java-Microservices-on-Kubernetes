package com.reservation.ensi.persistence;

import com.reservation.ensi.model.Reservation;
import com.reservation.ensi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findReservationsByUser(User user);

}
