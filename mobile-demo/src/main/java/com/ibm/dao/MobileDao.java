package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ibm.entity.Mobile;

public class MobileDao {
	private EntityManagerFactory factory;

	public MobileDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public void save (Mobile m) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(m);
		txn.commit();
		em.close();
	
	}
	
	public void Mobile (int id) {
		EntityManager em= factory.createEntityManager();
		Mobile m = em.find(Mobile.class,id);
	}
	
	
	
	
	
	
	
	
	
	

}
