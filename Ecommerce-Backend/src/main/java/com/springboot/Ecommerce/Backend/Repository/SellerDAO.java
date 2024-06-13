package com.springboot.Ecommerce.Backend.Repository;

import com.springboot.Ecommerce.Backend.Models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SellerDAO extends JpaRepository<Seller, Integer> {

    Optional<Seller> findByMobile(String mobile);
}
