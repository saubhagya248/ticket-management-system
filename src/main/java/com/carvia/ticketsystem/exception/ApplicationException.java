package com.carvia.ticketsystem.exception;

public class ApplicationException extends RuntimeException{
    public ApplicationException(String message){
        super(message);
    }
}
