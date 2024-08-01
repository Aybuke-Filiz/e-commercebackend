package com.workintech.e_commercebackend.controller;

import com.workintech.e_commercebackend.entity.Address;
import com.workintech.e_commercebackend.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }
    @PostMapping("/")
    public Address save(@RequestBody Address address){
       return addressService.save(address);
    }

}
