package com.example.demo.data.repositories.people;

import com.example.demo.data.models.people.Guest;
import org.springframework.data.repository.CrudRepository;


public interface GuestRepository extends CrudRepository<Guest,Long> {
}
