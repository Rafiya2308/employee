package com.example.employee.exception;

import com.example.employee.model.CommonError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler
{

    @ExceptionHandler(RecordNotFound.class)
    public ResponseEntity<CommonError> handleRecordNotFondException(RecordNotFound exception){
        List<String> list=new ArrayList<>();
        list.add(exception.getMessage());
        CommonError commonError=new CommonError(HttpStatus.NOT_FOUND.value(),"Invalid User", list);
        return new ResponseEntity<>(commonError,HttpStatus.NOT_FOUND);
    }
}
