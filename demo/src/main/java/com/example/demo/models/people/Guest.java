package com.example.demo.models.people;

import com.example.demo.models.buildings.Room;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "guest")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guest extends Person {

    @ManyToOne
    private Room room;


}
