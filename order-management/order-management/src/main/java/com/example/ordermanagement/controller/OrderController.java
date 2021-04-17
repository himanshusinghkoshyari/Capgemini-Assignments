package com.example.ordermanagement.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.ordermanagement.model.Order;
import com.example.ordermanagement.service.OrderService;


@RestController
public class OrderController {
	
	@Autowired
	private OrderService getService;
	
	@RequestMapping("/orderinfo")
	public Collection<Order> getOrder(){
		return getService.getOrder();
	}
	

	@GetMapping("/orderinfo/{orderId}")
	public  Optional<Order> getOrderById(@PathVariable String orderId){
		return getService.getOrderById(orderId);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addorder")
	public void addOrder(@RequestBody Order order) {
		getService.addOrder(order);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/orderinfo/{orderId}")
	public void deleteOrder(@PathVariable String  orderId) {
		getService.deleteOrder(orderId);
	}
	

	

}
