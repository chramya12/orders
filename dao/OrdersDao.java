
package com.orders.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orders.entity.Orders;

public interface OrdersDao extends JpaRepository<Orders, Integer>{

}