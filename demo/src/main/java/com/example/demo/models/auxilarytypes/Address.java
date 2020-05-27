package com.example.demo.models.auxilarytypes;

import com.example.demo.models.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Address extends BaseEntity {
    private String country;
    private String city;
    private String streetName;
    private String streetNumber;
}
