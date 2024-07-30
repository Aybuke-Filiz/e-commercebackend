package com.workintech.e_commercebackend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="unit_number")
    private long unitNumber;
    @Column(name="street_number")
    private long streetNumber;
    @Column(name="address_line1")
    private String addressLine1;
    @Column(name="address_line2")
    private String addressLine2;
    @Column(name="city")
    private String city;
    @Column(name="region")
    private String region;
    @Column(name="postal_code")
    private long postalCode;
    @Column(name="county_id")
    private long countryId;

}
