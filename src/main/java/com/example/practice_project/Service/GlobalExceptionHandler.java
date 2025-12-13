package com.example.practice_project.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import Exceptions.ResourceNotFoundtException;

@RestControllerAdvice
public class GlobalExceptionHandler 
{
  @ExceptionHandler(ResourceNotFoundtException.class)
  public ResponseEntity<ApiResponse> employeeNotFound(ResourceNotFoundtException ex)
  {
	return ResponseEntity.status(HttpStatus.NOT_FOUND)
			.body(new ApiResponse(false, ex.getMessage(), null));
  }
}
