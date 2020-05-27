package com.example.demo.models.buildings;

import com.example.demo.models.BaseEntity;
import com.example.demo.models.auxilarytypes.Address;
import com.example.demo.models.people.workers.Butler;
import com.example.demo.models.people.workers.Receptionist;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Hotel extends BaseEntity {

    @OneToOne
    private Address address;

    @OneToMany
    Set<Room> rooms = new HashSet<>();

    @OneToMany
    Set<Butler> butlers = new HashSet<>();

    @OneToMany
    Set<Receptionist> receptionists = new HashSet<>();


}
