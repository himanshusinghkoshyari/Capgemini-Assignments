package com.example.usermanagement.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.usermanagement.model.Worker;

@Service
public interface WorkerService {
	

 Optional<Worker> getWorker( String workerId);
	
	String createWorker(Worker worker) ;
	
	

	String updateWorker(Worker worker,String workerId) ;
	String deleteWorker(String  workerId) ;
		
}
