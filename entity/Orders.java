package com.orders.entity;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;
import org.springframework.data.annotation.Id;
import org.springframework.util.MultiValueMap;


@Entity
@Table(name="orders")
	public class Orders {
	private int orders_id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ordersId")
	private Integer ordersId;

	
	public Orders(Integer ordersId) {
		super();
		this.ordersId = ordersId;
		
	}
	
	public Orders() {
		super();
	}

	public Integer getOrderId() {
		return ordersId;
	}
	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}


	@Override
	public int hashCode() {
		return Objects.hash( ordersId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return Objects.equals(ordersId, other.ordersId);
	}

	@Override
	public String toString() {
		return "Orders[ordersId=" + ordersId + "]";
	}
	public void deleteOrdersById(Integer ordersId) {
		
	}

	public Orders updateOrders(Orders orders) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	public MultiValueMap getOrdersById(Integer ordersId2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Orders addOrders(Orders orders) {
		// TODO Auto-generated method stub
		return null;
	}

	
}



	