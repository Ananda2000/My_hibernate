package com.Hibernate.ManyToManyBidirection_2882022;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Mobile_28 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private int cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@ManyToMany(mappedBy = "mobile28",cascade=CascadeType.REMOVE)
	private List<Sim28> sim28;

	public List<Sim28> getSim28() {
		return sim28;
	}

	public void setSim28(List<Sim28> sim28) {
		this.sim28 = sim28;
	}

}
