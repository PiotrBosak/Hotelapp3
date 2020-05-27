package com.example.demo.repositories.buildings;

import com.example.demo.models.buildings.Room;
import org.springframework.data.repository.CrudRepository;


public interface RoomRepository extends CrudRepository<Room,Long> {
}
