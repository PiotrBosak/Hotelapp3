package com.example.demo.data.repositories.reservations;

import com.example.demo.data.models.reservations.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface ReservationRepository extends CrudRepository<Reservation,Long> {
}
