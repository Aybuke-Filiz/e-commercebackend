package com.workintech.e_commercebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ShippingMethodDto {
    private long id;
    private String name;
    private double price;
}
