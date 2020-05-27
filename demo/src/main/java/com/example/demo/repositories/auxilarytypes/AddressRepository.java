package com.example.demo.repositories.auxilarytypes;

import com.example.demo.models.auxilarytypes.Address;
import org.springframework.data.repository.CrudRepository;



public interface AddressRepository extends CrudRepository<Address,Long> {
}
