package com.example.demo.bootstrap;

import com.example.demo.data.models.buildings.Room;
import com.example.demo.data.repositories.buildings.HotelRepository;
import com.example.demo.data.repositories.buildings.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final HotelRepository hotelRepository;
    private final RoomRepository roomRepository;
    public DataLoader(HotelRepository hotelRepository, RoomRepository roomRepository) {
        this.hotelRepository = hotelRepository;
        this.roomRepository = roomRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Room room1 = new Room();
        room1.setRoomNumber(10);

        Room savedroom = roomRepository.save(room1);
        System.out.println(savedroom.getId());

    }
}

