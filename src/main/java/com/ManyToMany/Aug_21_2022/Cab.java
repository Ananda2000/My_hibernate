package com.ManyToMany.Aug_21_2022;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cab 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String Vehicle_no;
	private String Driver_Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicle_no() {
		return Vehicle_no;
	}
	public void setVehicle_no(String vehicle_no) 
	{
		Vehicle_no = vehicle_no;
	}
	public String getDriver_Name() {
		return Driver_Name;
	}
	public void setDriver_Name(String driver_Name)
	{
		Driver_Name = driver_Name;
	}

}
