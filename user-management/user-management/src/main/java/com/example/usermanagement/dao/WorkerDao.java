package com.example.usermanagement.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.usermanagement.model.Worker;

@Repository
public interface WorkerDao  extends MongoRepository<Worker,String>{

}
