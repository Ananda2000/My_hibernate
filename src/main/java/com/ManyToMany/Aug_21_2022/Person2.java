package com.ManyToMany.Aug_21_2022;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person2 
{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private double phone_number;
	private int age;
	
	@ManyToMany
List<Cab> cab;

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

public double getPhone_number() {
	return phone_number;
}

public void setPhone_number(long phone_number) {
	this.phone_number = phone_number;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public List<Cab> getCab() {
	return cab;
}

public void setCab(List<Cab> cab) {
	this.cab = cab;
}

}
