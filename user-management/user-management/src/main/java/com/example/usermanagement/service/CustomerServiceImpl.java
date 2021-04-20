package com.example.usermanagement.service;


import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.usermanagement.dao.CustomerDao;
import com.example.usermanagement.model.Customer;
import com.example.usermanagement.model.Order;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	CustomerDao customerRepo;

	@Override
	public Optional<Customer> getCustomer(String id) {
		// TODO Auto-generated method stub
		return customerRepo.findById(id);
	}


	@Override
	public String createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepo.insert(customer);
		return ("Added with id"+ customer.getId());
	}

	@Override
	public String updateCustomer(String id, Customer customer) {
		// TODO Auto-generated method stub
		customerRepo.save(customer);
		return("Updated with id"+id);
		
	}

	@Override
	public String deleteCustomer(String id) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(id);
		return("Delete with id"+id);
	}


	@Override
	public Order getOrder(String orderId) {
		// TODO Auto-generated method stub
		Order orderInfo = restTemplate.getForObject("http://OrderManagement/orderinfo/{orderId}" + orderId, Order.class);
		return orderInfo;
	}


	@Override
	public Optional<Order> getOrderById(String orderId) {
		// TODO Auto-generated method stub
		String url="http://OrderManagement/orderinfo/";
		Order order = restTemplate.getForObject(url + orderId, Order.class);
		return Optional.ofNullable(order);
		
	}


	@Override
	public String addOrder(Order order) {
		// TODO Auto-generated method stub
		String url="http://OrderManagement/addorder/";
		restTemplate.postForObject(url, order, Order.class);
		return("Your order is added");
		
	}


	@Override
	public String deleteOrder(String orderId) {
		// TODO Auto-generated method stub
		String url="http://OrderManagement/orderinfo/";
		restTemplate.delete(url+orderId);
		//restTemplate.delete(url, orderId);
		return("Deleted with id"+"orderId");
	}


	

}
