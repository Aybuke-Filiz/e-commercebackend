package com.workintech.e_commercebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserPaymentMethodDto {
    private long id;
    private long userId;
    private long paymentTypeId;
    private String provider;
    private String accountNumber;
    private Date expiryDate;
}
