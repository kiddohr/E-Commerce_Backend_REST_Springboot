package com.springboot.Ecommerce.Backend.Models;

import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDTO {

    @NotNull
    @Embedded
    private CreditCard cardNumber;
    @NotNull
    private String addressType;
}
