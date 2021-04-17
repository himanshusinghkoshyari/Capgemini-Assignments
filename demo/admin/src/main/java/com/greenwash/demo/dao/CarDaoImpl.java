/*package com.greenwash.demo.dao;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.greenwash.demo.entities.CarManagement;
@Repository
public class CarDaoImpl{
	
	@Autowired
	CarDao daod;
	MongoTemplate mongoTemplate;
	
	
	public List<CarManagement> getCars() {
		// TODO Auto-generated method stub
		//return mongoTemplate.findAll(CarManagement.class);
		return daod.findAll();
	}


	public CarManagement createCar(CarManagement car) {
		// TODO Auto-generated method stub
		mongoTemplate.save(car);
		// Now, user object will contain the ID as well
		return car;
	}


	public void updateCar(String id, CarManagement car) {
		// TODO Auto-generated method stub
		
	}


	public void deleteCar(String id) {
		int i=Integer.parseInt(id);  
		daod.deleteById(i);
		
	}

	
}
*/
