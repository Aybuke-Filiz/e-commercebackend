package com.workintech.e_commercebackend.service;

import com.workintech.e_commercebackend.entity.Address;
import com.workintech.e_commercebackend.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AddressServiceImpl implements AddressService{
    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address findById(long id) {
       Optional<Address> optionalAddress=addressRepository.findById(id);
       if(optionalAddress.isPresent()){
           return optionalAddress.get();
       }
       //throw exception
        return null;
    }

    @Override
    public Address save(Address address) {
        Optional<Address> optionalAddress=addressRepository.findById(address.getId());
        if(optionalAddress.isPresent()){
            //throw exception
        }
        Address savedAddress=addressRepository.save(address);
        return savedAddress;
    }

    @Override
    public Address update(long id, Address address) {
        findById(id);
        address.setId(id);
        Address updateAddress=addressRepository.save(address);
        return updateAddress;
    }

    @Override
    public Address delete(long id) {
        Address foundAddress=findById(id);
        addressRepository.deleteById(id);
        return foundAddress;
    }
}
