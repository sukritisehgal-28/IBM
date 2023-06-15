package com.ibm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.MovieDao;
import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class TestMovieDao {
	
	private static MovieDao dao;
	
	@BeforeAll
	public static void setup() {
		dao= new MovieDao();
	}
	
	@Test
	public void TestAddMovie() {
		Movie m = new Movie();
		m.setMovId(11);
		m.setTitle("cool");
		dao.addMovie(m);
		
	}
	@Test
	public void testAddMultiplex() {
		Multiplex m = new Multiplex();
		m.setMpexId(1);
		m.setName("pvr");
		dao.addMultiplex(m);
	}
	@Test
	public void testAddMovietiMultiplex() {
		dao.addMovieToMultiplex(21, 1);
	}
	

}
