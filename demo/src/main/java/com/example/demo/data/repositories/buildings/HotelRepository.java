package com.example.demo.data.repositories.buildings;

import com.example.demo.data.models.buildings.Hotel;
import org.springframework.data.repository.CrudRepository;


public interface HotelRepository extends CrudRepository<Hotel,Long> {
}
