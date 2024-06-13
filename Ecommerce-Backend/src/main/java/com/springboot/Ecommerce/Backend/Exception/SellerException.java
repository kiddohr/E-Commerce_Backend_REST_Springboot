package com.springboot.Ecommerce.Backend.Exception;

public class SellerException extends RuntimeException{
    public SellerException() {
        super();
    }

    public SellerException(String message) {
        super(message);
    }
}
