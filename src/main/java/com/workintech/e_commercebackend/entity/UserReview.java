package com.workintech.e_commercebackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="user_review")
public class UserReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="user_id")
    private long userId;
    @Column(name="ordered_product_id")
    private long orderedProductId;
    @Column(name="rating_value")
    private double ratingValue;
    @Column(name="comment")
    private String comment;
}
