package com.springboot.Ecommerce.Backend.Exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException() {
    }

    public ProductNotFoundException(String message){
        super(message);
    }
}
