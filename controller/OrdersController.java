package com.orders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orders.entity.Orders;
import com.orders.exception.OrdersAlreadyExistsException;
import com.orders.exception.OrdersNotFoundException;

@RestController
public class OrdersController {
	@Autowired
	private Orders orders;
	
	@GetMapping("/orders")
	public List<Orders> getAllCustomer(){
		return this.orders.getAllOrders();
	}
	@GetMapping("/orders/{ordersId}")
	public ResponseEntity getId(@PathVariable("ordersId") Integer ordersId) throws OrdersNotFoundException {
		return new ResponseEntity(orders.getOrdersById(ordersId), HttpStatus.OK);
	}
	@PostMapping("/orders")
	public Orders addCustomer(@RequestBody Orders orders) throws OrdersAlreadyExistsException{
		return this.orders.addOrders(orders);
	}
	@PutMapping("/orders")
	public Orders updateOrders(@RequestBody Orders orders)  throws  OrdersAlreadyExistsException{
		return this.orders.updateOrders(orders);
    }
	@DeleteMapping("/orders/{ordersId}")
	public void deleteOrders(@PathVariable("ordersId") Integer ordersId) throws OrdersNotFoundException {
		 this.orders.deleteOrdersById(ordersId);
}
}