package com.example.demo.data.repositories.buildings;

import com.example.demo.data.models.buildings.Room;
import org.springframework.data.repository.CrudRepository;


public interface RoomRepository extends CrudRepository<Room,Long> {
}
