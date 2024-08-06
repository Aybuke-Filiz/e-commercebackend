package com.workintech.e_commercebackend.service;

import com.workintech.e_commercebackend.dto.AddressDto;
import com.workintech.e_commercebackend.entity.Address;

import java.util.List;

public interface AddressService {

    List<AddressDto> findAll();
    AddressDto findById(long id);
    AddressDto save(AddressDto addressDto);
    AddressDto update(long id, AddressDto addressDto);
    AddressDto delete(long id);
}
