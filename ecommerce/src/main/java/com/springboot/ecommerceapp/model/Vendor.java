package com.springboot.ecommerceapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//jpa--> java persistence API

@Entity//--creates Db
public class Vendor {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}