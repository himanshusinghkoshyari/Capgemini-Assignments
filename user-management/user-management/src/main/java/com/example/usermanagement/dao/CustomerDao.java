package com.example.usermanagement.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.example.usermanagement.model.Customer;


@Repository
public interface CustomerDao  extends MongoRepository<Customer,String> {

	Optional<Customer> findByUsername(String username);





}
