package com.example.demo.data.repositories.people;

import com.example.demo.data.models.people.workers.Receptionist;
import org.springframework.data.repository.CrudRepository;


public interface ReceptionistRepository extends CrudRepository<Receptionist,Long> {
}
