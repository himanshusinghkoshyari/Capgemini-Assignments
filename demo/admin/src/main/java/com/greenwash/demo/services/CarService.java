package com.greenwash.demo.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.greenwash.demo.entities.CarManagement;
import com.greenwash.demo.entities.Customer;
import com.greenwash.demo.entities.Order;
import com.greenwash.demo.entities.Worker;

@Component
public interface CarService {
	
	
		
		Collection<CarManagement> getCars();

		String createCar(CarManagement car) ;

		String updateCar(String id, CarManagement car);

		String deleteCar(String id);

		Optional<Order> getOrderById(String orderId);

		String addOrder(Order order);

		String deleteOrder(String orderId);

		Optional<Customer> getCustomer(String customerId);

		String createCustomer(Customer customer);

		String updateCustomer(String customerId, Customer customer);

		String deleteCustomer(String customerId);

		Optional<Worker> getWorker(String workerId);

		String createWorker(Worker worker);

		String updateWorker(Worker worker, String workerId);

		String deleteWorker(String workerId);

		
		//@Bean
		//CarServiceImpl createBean();


	


}
