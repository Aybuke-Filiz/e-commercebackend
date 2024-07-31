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
public class ShopOrderDto {
    private long id;
    private long userId;
    private Date orderDate;
    private long paymentMethodId;
    private String shippingAddress;
    private String shippingMethod;
    private double orderTotal;
    private String orderStatus;
}
