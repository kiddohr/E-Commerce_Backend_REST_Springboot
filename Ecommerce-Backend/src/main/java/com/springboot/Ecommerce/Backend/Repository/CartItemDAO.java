package com.springboot.Ecommerce.Backend.Repository;

import com.springboot.Ecommerce.Backend.Models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemDAO extends JpaRepository<CartItem,Integer> {
}
