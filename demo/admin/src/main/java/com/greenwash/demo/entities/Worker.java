package com.greenwash.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="WorkerDetails")
public class Worker {
	
	@Id
	private String workerId;
	private String name;
	private String email;
	private String phoneNo;
	private String experience;
	private String address;
	private String city;
	private String state;
	private String username;
	private String password;
	public String getWorkerId() {
		return workerId;
	}
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public Worker() {
	}
	public Worker(String workerId, String name, String email, String phoneNo, String experience, String address,
			String city, String state, String username, String password) {
		super();
		this.workerId = workerId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.experience = experience;
		this.address = address;
		this.city = city;
		this.state = state;
		this.username = username;
		this.password = password;
	}
	
	

}
