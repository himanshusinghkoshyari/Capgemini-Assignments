package com.example.usermanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermanagement.dao.WorkerDao;
import com.example.usermanagement.model.Worker;

@Service
public class WorkerServiceImpl  implements WorkerService{
	
	@Autowired
	WorkerDao workerRepo;

	@Override
	public Optional<Worker> getWorker(String workerId) {
		// TODO Auto-generated method stub
		return workerRepo.findById(workerId);
	}

	@Override
	public String createWorker(Worker worker) {
		// TODO Auto-generated method stub
		workerRepo.insert(worker);
		return ("Added with id"+ worker.getWorkerId());
		
	}

	@Override
	public String updateWorker(Worker worker, String workerId) {
		// TODO Auto-generated method stub
		workerRepo.save(worker);
		return("Updated with id"+workerId);
		
	}

	@Override
	public String deleteWorker(String workerId) {
		// TODO Auto-generated method stub
		workerRepo.deleteById(workerId);
		return("Delete with id"+workerId);
		
		
	}

}
