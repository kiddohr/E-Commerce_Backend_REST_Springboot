package com.springboot.Ecommerce.Backend.Exception;

public class CustomerException extends RuntimeException {

    public CustomerException() {
        super();
    }

    public CustomerException(String message) {
        super(message);
    }
}
