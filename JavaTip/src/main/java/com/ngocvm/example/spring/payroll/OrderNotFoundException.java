package com.ngocvm.example.spring.payroll;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Could not find order "+ id);
    }
}
