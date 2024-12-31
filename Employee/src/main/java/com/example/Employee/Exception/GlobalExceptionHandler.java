package com.example.Employee.Exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleEmployeeNotFoundException(EmployeeNotFoundException employeexception, HttpServletRequest request){
    ErrorResponse response = new ErrorResponse();
    response.setTimeStamp(LocalDateTime.now());
    response.setMessage("EmployeeNotFound");
    response.setStatuscode(HttpStatus.NOT_FOUND);
    response.setBody("Employee not Found, Please try again later ");
    response.setPath(request.getRequestURI());

    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
}
}
