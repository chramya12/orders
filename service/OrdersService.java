package com.orders.service;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.orders.entity.Orders;
import com.orders.exception.OrdersAlreadyExistsException;
import com.orders.exception.OrdersNotFoundException;

public interface OrdersService {

	
public void deleteOrdersById(Integer ordersId2);
	public Orders updateOrders(Orders orders);
public List<Orders> getAllOrders();
	public Orders getOrdersById(Integer ordersId2) throws OrdersNotFoundException;
	public Orders addOrders(Orders orders) throws Exception;
	}

