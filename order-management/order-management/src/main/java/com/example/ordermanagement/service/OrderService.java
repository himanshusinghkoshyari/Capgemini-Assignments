package com.example.ordermanagement.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ordermanagement.model.Order;


@Service
public interface OrderService {
	

	Collection<Order> getOrder();

	String addOrder(Order order) ;

	String deleteOrder(String orderId);

	Optional<Order> getOrderById(String orderId);


}
