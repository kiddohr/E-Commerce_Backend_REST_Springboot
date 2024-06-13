package com.springboot.Ecommerce.Backend.Service;
import com.springboot.Ecommerce.Backend.Exception.*;
import com.springboot.Ecommerce.Backend.Models.Cart;
import com.springboot.Ecommerce.Backend.Models.CartDTO;

public interface CartService {

    public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
    public Cart getCartProduct(String token);
    public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFound;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);

    public Cart clearCart(String token);
}
