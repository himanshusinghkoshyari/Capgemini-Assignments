package com.greenwash.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ServicePlan")
public class ServicePlan {
	
	@Id
	private String planName;
	private String amount;
	private String timeTaken;
	
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTimeTaken() {
		return timeTaken;
	}
	public void setTimeTaken(String timeTaken) {
		this.timeTaken = timeTaken;
	}
	public ServicePlan() {
		
	}
	public ServicePlan(String planName, String amount, String timeTaken) {
		super();
		this.planName = planName;
		this.amount = amount;
		this.timeTaken = timeTaken;
	}
	
	
	

}
