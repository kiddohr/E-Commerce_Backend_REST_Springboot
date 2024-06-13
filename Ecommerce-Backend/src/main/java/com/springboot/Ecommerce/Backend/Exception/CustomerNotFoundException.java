package com.springboot.Ecommerce.Backend.Exception;

public class CustomerNotFoundException extends RuntimeException{

    public CustomerNotFoundException() {
        super();
    }

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
