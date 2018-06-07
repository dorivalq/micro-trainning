package com.silva.crud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATE")
public class State {
	@Id
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SIMBOL")
	private String simbol;

	public State(Long id2) {
		this.id = id2;
	}
	public State(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSimbol() {
		return simbol;
	}

	public void setSimbol(String simbol) {
		this.simbol = simbol;
	}

	public Long getId() {
		return id;
	}

}
