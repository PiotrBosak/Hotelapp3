package com.example.demo.repositories.reservations;

import com.example.demo.models.reservations.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface ReservationRepository extends CrudRepository<Reservation,Long> {
}
