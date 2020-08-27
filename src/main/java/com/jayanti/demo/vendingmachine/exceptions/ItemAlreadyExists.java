package com.jayanti.demo.vendingmachine.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class ItemAlreadyExists extends RuntimeException {
    public ItemAlreadyExists(String message){
        super(message);
    }
}
