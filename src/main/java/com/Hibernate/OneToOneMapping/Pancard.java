package com.Hibernate.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pancard 
{
	@Id
	private int panno;
	private String name;
	public int getPanno() {
		return panno;
	}
	public void setPanno(int panno) {
		this.panno = panno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
