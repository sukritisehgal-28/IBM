package com.ibm.bean;

public class Order {
	private int OrderNo;
	private String stock;
	private String Action;
	private int quantity;
	private double amount;
	private double commision;
	public Order(int orderNo, String stock, String action, int quantity, double amount, double commision) {
		super();
		OrderNo = orderNo;
		this.stock = stock;
		Action = action;
		this.quantity = quantity;
		this.amount = amount;
		this.commision = commision;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public int getOrderNo() {
		return OrderNo;
	}
	public void setOrderNo(int orderNo) {
		OrderNo = orderNo;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getCommision() {
		return commision;
	}
	public void setCommision(double commision) {
		this.commision = commision;
	}
	
	public double getOrderTotal() {
		return this.amount*this.quantity;
		
	}
	
	

	
	

}
