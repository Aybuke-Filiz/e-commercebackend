package com.workintech.e_commercebackend.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PromotionDto {
    private long id;
    private String name;
    private String description;
    private BigDecimal discountRate;
    private Date startDate;
    private Date endDate;
}
