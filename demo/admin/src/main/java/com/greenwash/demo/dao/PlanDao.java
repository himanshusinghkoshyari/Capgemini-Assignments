package com.greenwash.demo.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.greenwash.demo.entities.ServicePlan;
@Repository
@Primary
public interface PlanDao extends MongoRepository<ServicePlan, String>{

}
