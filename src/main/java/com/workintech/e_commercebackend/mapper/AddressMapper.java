package com.workintech.e_commercebackend.mapper;

import com.workintech.e_commercebackend.dto.AddressDto;
import com.workintech.e_commercebackend.entity.Address;

public class AddressMapper {
    public static AddressDto addressToAddressDto(Address address){
        AddressDto addressDto= new AddressDto(address.getId(), address.getUnitNumber(),
                address.getStreetNumber(), address.getAddressLine1(), address.getAddressLine2(),
                address.getRegion(), address.getCity(), address.getCountryId(), address.getPostalCode());
        return addressDto;
    }
    public static Address addressDtoToAddress(AddressDto addressDto){
        Address address=new Address(addressDto.getId(), addressDto.getUnitNumber(), addressDto.getStreetNumber(),
                addressDto.getAddressLine1(), addressDto.getAddressLine2(), addressDto.getRegion(), addressDto.getCity(),
                addressDto.getCountryId(), addressDto.getPostalCode());
        return address;
    }
}
