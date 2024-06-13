package com.springboot.Ecommerce.Backend.Exception;

public class SellerNotFoundException extends RuntimeException{
    public SellerNotFoundException() {
        super();
    }


    public SellerNotFoundException(String message) {
        super(message);
    }
}
