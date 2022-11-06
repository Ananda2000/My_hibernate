package com.Hibernate.BiDirection.OneToMany27822;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mobile_sims 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Mobile1 mob = new Mobile1();
		
		mob.setBrand("Apple");
		mob.setColor("list blue");
		mob.setCost(98393);
		
		Sims sims1 = new Sims();
		sims1.setCost(89);
		sims1.setProvider("airtel");
		
		Sims sims2 = new Sims();
		sims2.setCost(94);
		sims2.setProvider("Jio");
		
		List<Sims> sim = new ArrayList<Sims>();
		sim.add(sims1);
		sim.add(sims2);
		
		mob.setSims(sim);
		
		et.begin();
		em.persist(mob);
		em.persist(sims1);
		em.persist(sims2);
		et.commit();
	}

}
