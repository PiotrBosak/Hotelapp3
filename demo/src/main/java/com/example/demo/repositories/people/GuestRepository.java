package com.example.demo.repositories.people;

import com.example.demo.models.people.Guest;
import org.springframework.data.repository.CrudRepository;


public interface GuestRepository extends CrudRepository<Guest,Long> {
}
