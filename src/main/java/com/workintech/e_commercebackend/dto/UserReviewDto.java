package com.workintech.e_commercebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserReviewDto {
    private long id;
    private long userId;
    private long orderedProductId;
    private double ratingValue;

    private String comment;
}
