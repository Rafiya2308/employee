package com.example.employee.exception;

public class RecordNotFound extends RuntimeException{

    public RecordNotFound(String message){
        super(message);
    }
}
