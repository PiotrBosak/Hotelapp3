package com.example.demo.web.services.basic.implementations;

import com.example.demo.data.models.buildings.Room;
import com.example.demo.data.repositories.buildings.RoomRepository;
import com.example.demo.web.services.basic.interfaces.BasicRoomService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BasicRoomServiceImpl implements BasicRoomService {
    private final RoomRepository repository;

    public BasicRoomServiceImpl(RoomRepository repository) {
        this.repository = repository;
    }

    @Override
    public int getRoomNumberById(long id) {
        Optional<Room> room =  repository.findById(id);
        return room.map(Room::getRoomNumber).orElse(-1);
    }
}
