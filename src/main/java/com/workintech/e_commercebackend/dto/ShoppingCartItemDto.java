package com.workintech.e_commercebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ShoppingCartItemDto {
    private long id;
    private long cartId;
    private long productItemId;
}
