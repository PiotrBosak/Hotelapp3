package com.example.demo.bootstrap;

import com.example.demo.data.repositories.buildings.HotelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final HotelRepository hotelRepository;

    public DataLoader(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

