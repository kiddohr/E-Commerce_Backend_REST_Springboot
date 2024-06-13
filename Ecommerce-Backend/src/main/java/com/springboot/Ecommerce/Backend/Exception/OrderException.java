package com.springboot.Ecommerce.Backend.Exception;

public class OrderException extends RuntimeException{

    public OrderException() {

    }
    public OrderException(String message) {
        super(message);
    }
}
