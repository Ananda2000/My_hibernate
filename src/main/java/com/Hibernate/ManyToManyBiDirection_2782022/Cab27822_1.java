package com.Hibernate.ManyToManyBiDirection_2782022;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Cab27822_1 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCab_name() {
		return cab_name;
	}

	public void setCab_name(String cab_name) {
		this.cab_name = cab_name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public List<Person27> getPerson27() {
		return person27;
	}

	public void setPerson27(List<Person27> person27) {
		this.person27 = person27;
	}

	private  String cab_name;
	private int cost;
	
	@ManyToMany
	private List<Person27> person27;
	
	

}
