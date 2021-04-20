package com.example.usermanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="orderManagement")
public class Order {
	
	@Id
	private String orderId;
	private String carNo;
	private String name;
	private String serviceType;
	private String description;
	
	
	
	public Order() {
	}
	public Order(String orderId, String carNo, String name, String serviceType, String description) {
		super();
		this.orderId = orderId;
		this.carNo = carNo;
		this.name = name;
		this.serviceType = serviceType;
		this.description = description;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
