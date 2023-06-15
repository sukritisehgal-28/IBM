package com.ibm.service;

import java.util.Map;

import com.ibm.bean.Order;

public class OrderServices {
	
	private Map<Integer, Order> orders;
	
	public int placeOrder(Order order) {
		
		order.setOrderNo(orderNo);
		return 0;
		
	}
	
	public Order getOrder(int orderNo) {
	
		
		return orders.get(orderNo);
		
	}
	
	

}
