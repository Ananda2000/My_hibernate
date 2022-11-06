package com.ManyToMany.Aug_21_2022;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass_Cab_Person 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person2 ps2 = new Person2();
		ps2.setAge(15);
		ps2.setName("kumar");
		ps2.setPhone_number(940398203);
		
		Cab c1 = new Cab();
		c1.setDriver_Name("shivu");
		c1.setVehicle_no("ka-898");
		
		Cab c2 = new Cab();
		c2.setDriver_Name("gora");
		c2.setVehicle_no("ap-3993");
		
		Cab c3 = new Cab();
		c3.setDriver_Name("Dinga");
		c3.setVehicle_no("ts-83939");
		List<Cab> lis1= new ArrayList<Cab>();
		lis1.add(c1);
		lis1.add(c2);
		lis1.add(c3);
		ps2.setCab(lis1);
		
		et.begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(ps2);
		et.commit();
		
	}

}
