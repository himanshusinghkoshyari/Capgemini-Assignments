package com.example.usermanagement.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.usermanagement.model.Customer;
import com.example.usermanagement.model.Order;
import com.example.usermanagement.model.Worker;
import com.example.usermanagement.service.CustomerService;
import com.example.usermanagement.service.WorkerService;



@RestController
public class UserController {
	
	@Autowired
	CustomerService customerResc;
	@Autowired
	WorkerService workerResc;
	
	@GetMapping("/")
	public String userhome() {
		return("Welcome");
	}

	@GetMapping("/customerinfo/{customerId}")
	public  Optional<Customer> getCustomer(@PathVariable String customerId){
		return customerResc.getCustomer(customerId);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addcustomer")
	public void createCustomer(@RequestBody Customer customer) {
		customerResc.createCustomer(customer);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/customerinfo/{customerId}")
	public void updateCustomer(@RequestBody Customer customer,@PathVariable String customerId) {
		customerResc.updateCustomer(customerId, customer);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/customerinfo/{customerId}")
	public void deleteCustomer(@PathVariable String  customerId) {
		customerResc.deleteCustomer(customerId);
	}
	
	
	@GetMapping("/workerinfo/{workerId}")
	public  Optional<Worker> getWorker(@PathVariable String workerId){
		return workerResc.getWorker(workerId);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addworker")
	public void createWorker(@RequestBody Worker worker) {
		workerResc.createWorker(worker);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/workerinfo/{workerId}")
	public void updateWorker(@RequestBody Worker worker,@PathVariable String workerId) {
		workerResc.updateWorker(worker, workerId);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/workerinfo/{workerId}")
	public void deleteWorker(@PathVariable String  workerId) {
		workerResc.deleteWorker(workerId);
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
