package com.greenwash.demo.dao;


import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.greenwash.demo.entities.CarManagement;
@Repository
@Primary
public interface CarDao extends MongoRepository<CarManagement, String> {
	
	
	
	//Collection<CarManagement> getCars();

	//CarManagement createCar(CarManagement car) ;
	
	//void updateCar(String id, CarManagement car);

	//void deleteCar(String id);





}
