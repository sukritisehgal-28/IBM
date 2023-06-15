package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.CustomerDao;
import com.ibm.entity.Customer;

public class TestCustomerDao {
	
	private static CustomerDao dao;
	
	@BeforeAll 
	public static void setup() {
		dao = new CustomerDao();
	}

	
	@Test
	public void testSave() {
		Customer c = new Customer(211,"ben",2000);
		dao.save(c);
	}
	
	@Test
	public void testFetch() {
		Customer c = dao.fetch(211);
		assertNotNull(c);
		System.out.println(c.getCustName());
	}
}
