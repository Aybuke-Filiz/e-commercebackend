package com.workintech.e_commercebackend.service;

import com.workintech.e_commercebackend.dto.AddressDto;
import com.workintech.e_commercebackend.entity.Address;
import com.workintech.e_commercebackend.mapper.AddressMapper;
import com.workintech.e_commercebackend.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class AddressServiceImpl implements AddressService{
    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<AddressDto> findAll() {
        return addressRepository.findAll().
                stream().
                map((address) -> AddressMapper.addressToAddressDto(address))
                .collect(Collectors.toList());

    }

    @Override
    public AddressDto findById(long id) {
       Optional<Address> optionalAddress=addressRepository.findById(id);
       if(optionalAddress.isPresent()){
           return AddressMapper.addressToAddressDto(optionalAddress.get());

       }
       //throw exception
        return null;
    }

    @Override
    public AddressDto save(AddressDto addressDto) {
        Optional<Address> optionalAddress=addressRepository.findById(addressDto.getId());
        if(optionalAddress.isPresent()){
            //throw exception
        }
        Address address=AddressMapper.addressDtoToAddress(addressDto);
        Address savedAddress=addressRepository.save(address);
        return AddressMapper.addressToAddressDto(savedAddress);
    }

    @Override
    public AddressDto update(long id, AddressDto addressDto) {
        findById(id);
        addressDto.setId(id);
        Address address=AddressMapper.addressDtoToAddress(addressDto);
        Address updateAddress=addressRepository.save(address);
        return AddressMapper.addressToAddressDto(updateAddress);
    }

    @Override
    public AddressDto delete(long id) {
        AddressDto foundAddress=findById(id);
        addressRepository.deleteById(id);
        return foundAddress;
    }
}
