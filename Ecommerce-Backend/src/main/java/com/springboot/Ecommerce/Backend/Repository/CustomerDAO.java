package com.springboot.Ecommerce.Backend.Repository;

import com.springboot.Ecommerce.Backend.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerDAO extends JpaRepository<Customer,Integer> {

    Optional<Customer> findByMobileNo(String mobileNo);

    Optional<Customer> findByEmailId(String emailId);

    Optional<Customer> findByMobileNoOrEmailId(String mobileNo, String emailId);
}
