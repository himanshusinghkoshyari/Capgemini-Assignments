package com.example.usermanagement.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection="customer")
public class Customer {

	@Id
	private String customerId;
	private String name;
	private String email;
	private String phoneNo;
	private String address;
	private String city;
	private String state;
	private String username;
	private String password;

	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
	
	public Customer() {
	}
	public Customer(String customerId, String name, String email, String phoneNo, String address, String city,
			String state, String username, String password) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.city = city;
		this.state = state;
		this.username = username;
		this.password = password;
	}
	
	


}
