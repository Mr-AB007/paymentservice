package com.microservice.paymentservice.exception;

import lombok.Getter;

@Getter
public class PaymentServiceCustomException extends RuntimeException{
    private final String errorCode;

    public PaymentServiceCustomException(String message, String errorCode){
        super(message);
        this.errorCode = errorCode;
    }
}
