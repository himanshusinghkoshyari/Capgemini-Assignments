package com.greenwash.demo.services;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.greenwash.demo.entities.ServicePlan;

@Component
public interface PlanServ {
	

	Collection<ServicePlan> getService();

	String addService(ServicePlan service) ;

	String updateService(String id, ServicePlan service);

	String deleteService(String id);

}
