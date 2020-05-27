package com.example.demo.data.repositories.reservations;

import com.example.demo.data.models.reservations.Booking;
import org.springframework.data.repository.CrudRepository;


public interface BookingRepository extends CrudRepository<Booking,Long> {
}
