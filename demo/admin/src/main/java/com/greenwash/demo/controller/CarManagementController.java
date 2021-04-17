package com.greenwash.demo.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.greenwash.demo.entities.CarManagement;
import com.greenwash.demo.entities.Customer;
import com.greenwash.demo.entities.Order;
import com.greenwash.demo.entities.ServicePlan;
import com.greenwash.demo.entities.Worker;
import com.greenwash.demo.services.CarService;
import com.greenwash.demo.services.PlanServ;

@RestController
@RequestMapping("/admin")
public class CarManagementController {
	
	@Autowired
	CarService getCar;
	
	@Autowired
	PlanServ getPlan;
	
	//CarManagement
	
	@RequestMapping("/carinfo")
	public Collection<CarManagement> getCars(){
		return getCar.getCars();
	}
	@RequestMapping(method=RequestMethod.POST,value="/addcar")
	public void addTopic(@RequestBody CarManagement car) {
		getCar.createCar(car);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/info/{id}")
	public void updateTopic(@RequestBody CarManagement car,@PathVariable String id) {
		getCar.updateCar(id, car);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/info/{id}")
	public void deleteTopic(@PathVariable String  id) {
		getCar.deleteCar(id);
	}
	
	//ServicePlan
	
	@RequestMapping("/serviceinfo")
	public Collection<ServicePlan> getService(){
		return getPlan.getService();
	}
	@RequestMapping(method=RequestMethod.POST,value="/addservice")
	public void addService(@RequestBody ServicePlan service) {
		getPlan.addService(service);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/serviceinfo/{id}")
	public void updateService(@RequestBody ServicePlan service,@PathVariable String id) {
		getPlan.updateService(id, service);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/serviceinfo/{id}")
	public void deleteService(@PathVariable String  id) {
		getPlan.deleteService(id);
	}
	
	///order microservice
	

	@GetMapping("/orderinfo/{orderId}")
	public  Optional <Order> getOrderById(@PathVariable String orderId){
		return getCar.getOrderById(orderId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addorder")
	public void addOrder(@RequestBody Order order) {
		getCar.addOrder(order);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/orderinfo/{orderId}")
	public void deleteOrder(@PathVariable String  orderId) {
		getCar.deleteOrder(orderId);
	}
	
	//Customer functionality

	@GetMapping("/customerinfo/{customerId}")
	public  Optional<Customer> getCustomer(@PathVariable String customerId){
		return getCar.getCustomer(customerId);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addcustomer")
	public void createCustomer(@RequestBody Customer customer) {
		getCar.createCustomer(customer);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/customerinfo/{customerId}")
	public void updateCustomer(@RequestBody Customer customer,@PathVariable String customerId) {
		getCar.updateCustomer(customerId, customer);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/customerinfo/{customerId}")
	public void deleteCustomer(@PathVariable String  customerId) {
		getCar.deleteCustomer(customerId);
	}
	
	//worker functionality
	
	@GetMapping("/workerinfo/{workerId}")
	public  Optional<Worker> getWorker(@PathVariable String workerId){
		return getCar.getWorker(workerId);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addworker")
	public void createWorker(@RequestBody Worker worker) {
		getCar.createWorker(worker);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/workerinfo/{workerId}")
	public void updateWorker(@RequestBody Worker worker,@PathVariable String workerId) {
		getCar.updateWorker(worker, workerId);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/workerinfo/{workerId}")
	public void deleteWorker(@PathVariable String  workerId) {
		getCar.deleteWorker(workerId);
	}
	
	

}
