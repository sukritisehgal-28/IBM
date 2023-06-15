package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="emp")

public class Employee {
	@Id
	@Column(name = "emp_no")
	@GeneratedValue
	private int empNo;
	@Column(name ="ename" , length = 20)
	private String empName;
	private double salary;
	
	
	@ManyToOne
	@JoinColumn(name = "dept_no")
	private Department dept;
	
	
	public Employee() {
		
	}
	public Employee( String empName, double salary) {
	
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
}
	
