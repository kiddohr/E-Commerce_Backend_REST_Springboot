package com.springboot.Ecommerce.Backend.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartItemId;


    @OneToOne
    @JsonIgnoreProperties(value={
            "productId",
            "seller",
            "quantity"

    })
    private Product cartProduct;

    private Integer cartItemQuantity;
}
