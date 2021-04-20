package com.example.usermanagement.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.usermanagement.model.Customer;
import com.example.usermanagement.model.Order;
import com.example.usermanagement.service.CustomerService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	CustomerService customerResc;
	
	@GetMapping("/customer")
	public String home() {
		return ("Welcome ");
	}
	@GetMapping("/worker")
    public String admin() {
        return ("Welcome Worker");
    }

	@GetMapping("/customerinfo/{id}")
	public  Optional<Customer> getCustomer(@PathVariable String id){
		return customerResc.getCustomer(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addcustomer")
	public void createCustomer(@RequestBody Customer customer) {
		customerResc.createCustomer(customer);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/customerinfo/{id}")
	public void updateCustomer(@RequestBody Customer customer,@PathVariable String id) {
		customerResc.updateCustomer(id, customer);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/customerinfo/{id}")
	public void deleteCustomer(@PathVariable String  id) {
		customerResc.deleteCustomer(id);
	}
	
	
	
	//order microservice call
	@GetMapping("/getOrder/{orderId}")
	public  Order getOrder(@PathVariable String orderId) {
		return customerResc.getOrder(orderId);
	}
	
	@GetMapping("/orderinfo/{orderId}")
	public  Optional <Order> getOrderById(@PathVariable String orderId){
		return customerResc.getOrderById(orderId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addorder")
	public void addOrder(@RequestBody Order order) {
		customerResc.addOrder(order);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/orderinfo/{orderId}")
	public void deleteOrder(@PathVariable String  orderId) {
		customerResc.deleteOrder(orderId);
	}
	
	


}
