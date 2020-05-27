package com.example.demo.repositories.people;

import com.example.demo.models.people.workers.Receptionist;
import org.springframework.data.repository.CrudRepository;


public interface ReceptionistRepository extends CrudRepository<Receptionist,Long> {
}
