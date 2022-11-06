package com.Hibernate.OneToMany_Mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Bank 
{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private String Bname;
	private String Location;

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public String getLocation() {
		return Location;
	}
	

	public void setLocation(String location) {
		Location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
