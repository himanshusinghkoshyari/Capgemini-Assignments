package com.example.usermanagement.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection="Users")
public class Customer {

	@Id
	private String id;
	private Boolean isActive;
	private String username;
	private String password;
	private String name;
	private String role;
	private String email;
	private String phoneNo;
	private String address;
	
	
	
	
	public Customer() {
	}
	public Customer(String id, Boolean isActive, String username, String password, String name, String role,
			String email, String phoneNo, String address) {
		super();
		this.id = id;
		this.isActive = isActive;
		this.username = username;
		this.password = password;
		this.name = name;
		this.role = role;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	
	

	
	


}
