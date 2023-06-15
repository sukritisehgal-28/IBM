package com.ibm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;


@Entity
public class Movie {
	@Id
	private int movId;
	public Set<Multiplex> getMultiplexes() {
		return multiplexes;
	}



	public void setMultiplexes(Set<Multiplex> multiplexes){
		this.multiplexes = multiplexes;
	}



	@Column(length = 20)
	private String title;
	
	
	
	@ManyToMany
	@JoinTable(name = "shows",joinColumns = {@JoinColumn(name = "movId")}, inverseJoinColumns= {@JoinColumn(name = "mpexId")})
	
	Set<Multiplex> multiplexes = new HashSet<>();



	public int getMovId() {
		return movId;
	}



	public void setMovId(int movId) {
		this.movId = movId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}

}
