package com.Hibernate.Bi_direction_OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GeneratorType;

@Entity
public class AadharCard_27082022_1

{
	public double getAadhar_no() {
		return Aadhar_no;
	}


	public void setAadhar_no(int aadhar_no) {
		Aadhar_no = aadhar_no;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public Person2782020_1 getPerson_1() {
		return person_1;
	}


	public void setPerson_1(Person2782020_1 person_1) {
		this.person_1 = person_1;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Aadhar_no;
	private String Address;
	
	
	@OneToOne
	private Person2782020_1 person_1;

}
