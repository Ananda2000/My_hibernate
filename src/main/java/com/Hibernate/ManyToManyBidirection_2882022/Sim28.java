package com.Hibernate.ManyToManyBidirection_2882022;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Sim28 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String provider;
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@ManyToMany
	@JoinColumn
	private List<Mobile_28> mobile28;

	public List<Mobile_28> getMobile28() {
		return mobile28;
	}

	public void setMobile28(List<Mobile_28> mobile28) {
		this.mobile28 = mobile28;
	}

}
