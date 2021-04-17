package com.greenwash.demo.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.greenwash.demo.dao.CarDao;

import com.greenwash.demo.entities.CarManagement;
import com.greenwash.demo.entities.Customer;
import com.greenwash.demo.entities.Order;
import com.greenwash.demo.entities.Worker;



@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	CarDao carRepo;
	
	public Collection<CarManagement> getCars() {
		// TODO Auto-generated method stub
		return carRepo.findAll();
	}

	public String createCar(CarManagement car) {
		// TODO Auto-generated method stub
		//return carDAOO.createCar(car);
		carRepo.insert(car);
		return ("Added with id"+ car.getCarNo());
	}

	@Override
	public String updateCar(String id, CarManagement car) {
		// TODO Auto-generated method stub
		carRepo.save(car);
		return("Updated with id"+id);
		
	}

	@Override
	public String deleteCar(String id) {
		// TODO Auto-generated method stub
		carRepo.deleteById(id);
		return("Delete with carNo"+id);
		
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

	@Override
	public Optional<Customer> getCustomer(String customerId) {
		// TODO Auto-generated method stub
		String url="http://Users/customerinfo/";
		Customer customerinfo = restTemplate.getForObject(url + customerId, Customer.class);
		return Optional.ofNullable(customerinfo);
	}

	@Override
	public String createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		String url="http://Users/addcustomer/";
		restTemplate.postForObject(url, customer, Customer.class);
		return("New Customer is added");
	}

	@Override
	public String updateCustomer(String customerId, Customer customer) {
		// TODO Auto-generated method stub
		//customerinfo/{customerId}
		String url="http://Users/customerinfo/";
		restTemplate.put(url+customerId,customer);
		return("Customer with id"+customerId+"is updated");
	}

	@Override
	public String deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		String url="http://Users/customerinfo/";
		restTemplate.delete(url+customerId);
		return("Deleted with id"+customerId);
	}

	@Override
	public Optional<Worker> getWorker(String workerId) {
		// TODO Auto-generated method stub
		String url="http://Users/workerinfo/";
		Worker workerinfo = restTemplate.getForObject(url + workerId, Worker.class);
		return Optional.ofNullable(workerinfo);
	}

	@Override
	public String createWorker(Worker worker) {
		// TODO Auto-generated method stub
		String url="http://Users/addworker/";
		restTemplate.postForObject(url, worker, Worker.class);
		return("New Worker is added");
	}

	@Override
	public String updateWorker(Worker worker, String workerId) {
		// TODO Auto-generated method stub
		String url="http://Users/workerinfo/";
		restTemplate.put(url+workerId,worker);
		return("Customer with id"+workerId+"is updated");
	}

	@Override
	public String deleteWorker(String workerId) {
		// TODO Auto-generated method stub
		String url="http://Users/workerinfo/";
		restTemplate.delete(url+workerId);
		return("Deleted with id"+workerId);
	}


	
}
