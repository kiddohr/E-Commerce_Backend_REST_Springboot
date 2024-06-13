package com.springboot.Ecommerce.Backend.Repository;

import com.springboot.Ecommerce.Backend.Models.Customer;
import com.springboot.Ecommerce.Backend.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderDAO extends JpaRepository<Order,Integer> {

    @Query("select c from Customer c where c.customerId = customerId")
    public Customer getCustomerByOrderId(@Param("customerId") Integer customerId);

    public List<Order> findByDate(LocalDate date);
}
