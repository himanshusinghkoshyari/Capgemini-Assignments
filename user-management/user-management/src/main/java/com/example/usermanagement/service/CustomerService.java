package com.example.usermanagement.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.usermanagement.model.Customer;
import com.example.usermanagement.model.Order;


@Service
public interface CustomerService {
	
	Optional<Customer> getCustomer(String id);

	String createCustomer(Customer customer) ;

	String updateCustomer(String id, Customer customer);

	String deleteCustomer(String id);

	Order getOrder(String orderId);

	Optional<Order> getOrderById(String orderId);

	String addOrder(Order order);

	String deleteOrder(String orderId);



}
