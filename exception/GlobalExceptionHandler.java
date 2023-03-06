package com.orders.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = OrdersNotFoundException.class)
	public ResponseEntity<String> flightNotFound(OrdersNotFoundException e) {
		return new ResponseEntity<>("Customer Not Found", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = OrdersAlreadyExistsException.class)
	public ResponseEntity<String> flightNotFound(OrdersAlreadyExistsException e) {
		return new ResponseEntity<>("Customer Already Exists", HttpStatus.NOT_FOUND);
	}

}


