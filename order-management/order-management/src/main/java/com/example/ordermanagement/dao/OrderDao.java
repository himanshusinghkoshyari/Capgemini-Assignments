package com.example.ordermanagement.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ordermanagement.model.Order;

@Repository
public interface OrderDao  extends MongoRepository<Order,String> {

}
