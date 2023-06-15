package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.EmpDeptDao;
import com.ibm.entity.Department;
import com.ibm.entity.Employee;

public class TestEmptyDeptDao {
	private static EmpDeptDao dao;
	
	@BeforeAll
	public static void setup() {
		dao = new EmpDeptDao();
	}
	
	@Test
	public void testAddDept() {
		Department dept = new Department(10,"accounts");
		assertTrue(dao.addDept(dept)!=0);
		
	}
	
	@Test 
	public void testAddEmp() {
		Employee emp = new Employee("frank",2000);
		assertTrue(dao.addEmp(emp, 10)!=0);
	}
	
	
	

}
