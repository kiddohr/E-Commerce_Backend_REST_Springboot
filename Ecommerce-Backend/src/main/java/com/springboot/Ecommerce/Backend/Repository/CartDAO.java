package com.springboot.Ecommerce.Backend.Repository;

import com.springboot.Ecommerce.Backend.Models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDAO extends JpaRepository<Cart,Integer> {
}
