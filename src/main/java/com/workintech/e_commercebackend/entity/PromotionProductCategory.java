package com.workintech.e_commercebackend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="promotion_product_category")

public class PromotionProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="promotion_id")
    private long promotionId;
    @Column(name="product_category_id")
    private long productCategoryId;
}
