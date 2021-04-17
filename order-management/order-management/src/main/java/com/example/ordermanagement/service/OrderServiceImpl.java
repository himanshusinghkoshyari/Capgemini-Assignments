package com.example.ordermanagement.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ordermanagement.dao.OrderDao;
import com.example.ordermanagement.model.Order;
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDao orderDao;

	@Override
	public Collection<Order> getOrder() {
		// TODO Auto-generated method stub
		return orderDao.findAll();
	}

	@Override
	public String addOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.insert(order);
		return("Added with id"+order.getOrderId());
	}

	@Override
	public String deleteOrder(String orderId) {
		// TODO Auto-generated method stub
		orderDao.deleteById(orderId);
		return ("Deleted with id"+orderId);
	}

	@Override
	public Optional<Order> getOrderById(String orderId) {
		// TODO Auto-generated method stub
		return orderDao.findById(orderId);
	}

}
