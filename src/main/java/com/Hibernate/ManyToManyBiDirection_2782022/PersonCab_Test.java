package com.Hibernate.ManyToManyBiDirection_2782022;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonCab_Test 
{
	public static void main(String[]args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person27 per = new Person27();
		per.setAge(25);
		per.setName("soma");
		per.setPhone(938383);
		
		Person27 per1 = new Person27();
		per1.setAge(23);
		per1.setName("dhanu");
		per1.setPhone(94849);
		
		List<Person27> lis = new ArrayList<Person27>();
		lis.add(per);
		lis.add(per1);
		
		Cab27822_1 cabb = new Cab27822_1();
		
		cabb.setCab_name("ola");
		cabb.setCost(500);
		
		Cab27822_1 cabb1 = new Cab27822_1();
		cabb1.setCab_name("uber");
		cabb1.setCost(600);
		
		List<Cab27822_1> cablis= new ArrayList<Cab27822_1>();
		cablis.add(cabb);
		cablis.add(cabb1);
		
		per.setCab(cablis);
		cabb.setPerson27(lis);
		
		et.begin();
		em.persist(per);
		em.persist(per1);
		em.persist(cabb);
		em.persist(cabb1);
		
		et.commit();
		
		
		
		
	}

}
