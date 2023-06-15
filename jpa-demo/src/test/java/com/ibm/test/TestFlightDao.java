package com.ibm.test;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.FlightDao;
import com.ibm.entity.Flight;

public class TestFlightDao {
	
	private static FlightDao dao;
	
	@BeforeAll
	public static void setup() {
		dao = new FlightDao();
	}
	
	
	@Test
	public void testSave() {
		Flight f = new Flight(122, "indigo","k","ko");
		dao.save(f);
		
	}
	@Test
	public void testList() {
		List<Flight> flights = dao.list();
		flights.forEach(System.out::println);
	}
	
	@Test
	public void testListByCarrier() {
		List<Flight> flights = dao.listByCarrier("jet");
		flights.forEach(System.out::println);
	}
	
	@Test
	public void testListByRoute() {
		List<Flight> flights = dao.listByRoute("mumbai", "goa");
		flights.forEach(System.out::println);
	}
	

}
