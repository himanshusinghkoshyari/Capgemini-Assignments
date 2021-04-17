package com.greenwash.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CarManagement")
public class CarManagement {
	
	@Id
	private String carNo;
	private String color;
	private String carModel;
	private String ownerName;
	
	
	public CarManagement() {
		
	} 
	
	

	public CarManagement(String carNo, String color, String carModel, String ownerName) {
		super();
		this.carNo = carNo;
		this.color = color;
		this.carModel = carModel;
		this.ownerName = ownerName;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
}

