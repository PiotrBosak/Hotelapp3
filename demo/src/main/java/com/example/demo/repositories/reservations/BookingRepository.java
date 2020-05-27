package com.example.demo.repositories.reservations;

import com.example.demo.models.reservations.Booking;
import org.springframework.data.repository.CrudRepository;


public interface BookingRepository extends CrudRepository<Booking,Long> {
}
