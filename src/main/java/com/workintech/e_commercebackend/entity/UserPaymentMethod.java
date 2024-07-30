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
@Table(name="user_payment_method")
public class UserPaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="user_id")
    private long userId;
    @Column(name="payment_type_id")
    private long paymentTypeId;
    @Column(name="provider")
    private String provider;
    @Column(name="account_number")
    private String accountNumber;
    @Column(name="expiry_date")
    private Date expiryDate;
}
