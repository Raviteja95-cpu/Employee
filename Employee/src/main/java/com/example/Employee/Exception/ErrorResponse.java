package com.example.Employee.Exception;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ErrorResponse {
    private LocalDateTime timeStamp;
    private String message;
    private HttpStatus statuscode;
    private String body;
    private String path;

    public ErrorResponse() {

    }

    public ErrorResponse(LocalDateTime timeStamp, String message, HttpStatus statuscode, String body, String path) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.statuscode = statuscode;
        this.body = body;
        this.path = path;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(HttpStatus statuscode) {
        this.statuscode = statuscode;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "timeStamp=" + timeStamp +
                ", message='" + message + '\'' +
                ", statuscode=" + statuscode +
                ", body='" + body + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
