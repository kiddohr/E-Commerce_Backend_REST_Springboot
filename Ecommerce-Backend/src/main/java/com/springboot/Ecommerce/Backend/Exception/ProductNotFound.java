package com.springboot.Ecommerce.Backend.Exception;

public class ProductNotFound extends RuntimeException{

    public ProductNotFound() {
    }
    public ProductNotFound(String message) {
        super(message);
    }
}
