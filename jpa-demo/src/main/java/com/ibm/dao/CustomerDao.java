package com.ibm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Customer;
import com.mysql.cj.Query;

public class CustomerDao {
	
	private EntityManagerFactory factory;
	public CustomerDao()
	{
		factory = Persistence.createEntityManagerFactory("MyJPA");
		
	}
	
	public void save(Customer c) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(c);
		txn.commit();
		em.close();
		
		
	}
	
	public Customer fetch(int id) {
		EntityManager em= factory.createEntityManager();
		Customer c = em.find(Customer.class,id);
		return c;
		
	}
	
	public List<Customer> list(){
		EntityManager em = factory.createEntityManager();
		javax.persistence.Query query = em.createQuery("from customer");
		return query.getResultList();
	
		
	}
	
	public void update(Customer c ) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.merge(c);
		txn.commit();
		em.close();
	}
	
	public void delete(int id) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Customer c = em.find(Customer.class, id);
		em.remove(c);
		txn.commit();
		em.close();
		
	}
	
	
	

}
