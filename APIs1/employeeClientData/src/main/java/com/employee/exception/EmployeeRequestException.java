package com.employee.exception;

public class EmployeeRequestException extends RuntimeException {
    private String message;
    public EmployeeRequestException(String message) {
        super(message);
        this.message = message;
    }
    public EmployeeRequestException() {
    }
}
