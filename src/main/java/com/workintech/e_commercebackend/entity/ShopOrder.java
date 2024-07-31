package com.workintech.e_commercebackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="shop_order")
public class ShopOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="user_id")
    private long userId;
    @Column(name="order_date")
    private Date orderDate;
    @Column(name="payment_method_id")
    private long paymentMethodId;
    @Column(name="shipping_address")
    private String shippingAddress;
    @Column(name="shipping_method")
    private String shippingMethod;
    @Column(name="order_total")
    private double orderTotal;
    @Column(name="order_status")
    private String orderStatus;
}
