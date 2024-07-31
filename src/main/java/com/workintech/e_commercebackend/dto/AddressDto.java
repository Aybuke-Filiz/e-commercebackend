package com.workintech.e_commercebackend.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddressDto {
    private long id;
    private long unitNumber;
    private long streetNumber;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String region;
    private long postalCode;
    private long countryId;
}
