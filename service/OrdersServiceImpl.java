package com.orders.service;

    import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.orders.dao.OrdersDao;
import com.orders.entity.Orders;
import com.orders.exception.OrdersAlreadyExistsException;
import com.orders.exception.OrdersNotFoundException;

	@Service
	public class OrdersServiceImpl implements OrdersService {
		
		@Autowired
		private OrdersDao ordersDao;

		@Override
		public Orders addOrders(Orders orders) throws Exception {
			if(ordersDao.findById(orders.getOrderId()).isEmpty()) {
				return orders;
			}
			else {
				throw new OrdersAlreadyExistsException();
			}
		}
		
		@Override
		public Orders updateOrders(Orders orders) {
			ordersDao.save(orders);
			return orders;
		}

		@Override
		public Orders getOrdersById(Integer ordersId) throws OrdersNotFoundException {
			Orders c;
			if(ordersDao.findById(ordersId).isEmpty()) {
			 throw new OrdersNotFoundException();
			}
				 else {
					 c=ordersDao.findById(ordersId).get();	 
				 }
				 return c;
			}

		@SuppressWarnings("deprecation")
		@Override
		public void deleteOrdersById(Integer ordersId) {
			 Orders c=ordersDao.getById(ordersId);
			 ordersDao.delete(c);	
		}

		@Override
		public List getAllOrders() {
			 return ordersDao.findAll();
		}
		
}
