package com.jayanti.demo.vendingmachine.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class InsufficientQuantity extends RuntimeException {
    public InsufficientQuantity(String message){
        super(message);
    }
}
