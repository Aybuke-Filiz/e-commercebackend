package com.workintech.e_commercebackend.service;

import com.workintech.e_commercebackend.entity.Address;

import java.util.List;

public interface AddressService {

    List<Address> findAll();
    Address findById(long id);
    Address save(Address address);
    Address update(long id, Address address);
    Address delete(long id);
}
