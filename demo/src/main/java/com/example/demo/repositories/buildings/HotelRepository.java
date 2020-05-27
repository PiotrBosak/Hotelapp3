package com.example.demo.repositories.buildings;

import com.example.demo.models.buildings.Hotel;
import org.springframework.data.repository.CrudRepository;


public interface HotelRepository extends CrudRepository<Hotel,Long> {
}
