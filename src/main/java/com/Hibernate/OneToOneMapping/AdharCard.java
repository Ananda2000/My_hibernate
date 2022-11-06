package com.Hibernate.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdharCard 
{
	@Id
	private int adno;
	private String address;
	public int getAdno() {
		return adno;
	}
	public void setAdno(int adno) {
		this.adno = adno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
