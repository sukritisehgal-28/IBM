package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class MovieDao {
	
	private EntityManagerFactory factory;

	public MovieDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	
	public void addMovie(Movie movie) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(movie);
		txn.commit();
		em.close();
	
	}
	
	public void addMultiplex(Multiplex multiplex) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(multiplex);
		txn.commit();
		em.close();
	}
	
	public void addMovieToMultiplex(int movId , int mpexId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		
		try {
			txn.begin();
			Movie movie = em.find(Movie.class, movId);
			Multiplex multiplex = em.find(Multiplex.class, mpexId);
			movie.getMultiplexes().add(multiplex);
			txn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			txn.rollback();
		}finally {
			em.close();
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
