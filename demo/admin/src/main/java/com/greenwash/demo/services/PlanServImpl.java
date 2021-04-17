package com.greenwash.demo.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenwash.demo.dao.PlanDao;
import com.greenwash.demo.entities.ServicePlan;
@Service
public class PlanServImpl implements PlanServ {
	
	@Autowired
	PlanDao planRepo;

	@Override
	public Collection<ServicePlan> getService() {
		// TODO Auto-generated method stub
		return planRepo.findAll();
	}
	
	@Override
	public String addService(ServicePlan service) {
		// TODO Auto-generated method stub
		planRepo.insert(service);
		return ("Added with id"+ service.getPlanName());
	}




	@Override
	public String updateService(String id, ServicePlan service) {
		// TODO Auto-generated method stub
		planRepo.save(service);
		return("Updated service with id"+id);
	}

	@Override
	public String deleteService(String id) {
		// TODO Auto-generated method stub
		planRepo.deleteById(id);
		return("Delete with PlanName"+id);
	}



	
}
