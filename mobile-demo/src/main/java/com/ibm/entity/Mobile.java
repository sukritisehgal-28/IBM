package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MobilePh")

public class Mobile {
	@Id
	@Column(name="code")
	private int code;
	@Column(name="brand")
	private String brand;
	@Column(name="model")
	private String model;
	@Column(name="price")
	private double price;
	public Mobile(int code, String brand, String model, double price) {
		
		this.code = code;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public Mobile() {
		
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	

}
