package com.springboot.Ecommerce.Backend.Service;

import com.springboot.Ecommerce.Backend.Models.CartDTO;
import com.springboot.Ecommerce.Backend.Models.CartItem;

public interface CartItemService {
    public CartItem createItemForCart(CartDTO cartdto);
}
