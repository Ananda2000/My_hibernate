package com.ManyToOne.Aug_21_22;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MobileSim_ManyToOne 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("vikas");
		EntityManager em1= emf1.createEntityManager();
		EntityTransaction et1 = em1.getTransaction();
		
		
		
		SimManyToOne sim = new SimManyToOne();
		sim.setCost(2000);
		sim.setName("Anand");
		sim.setProvider("Airtel-kA");
		
		SimManyToOne sim1 = new SimManyToOne();
		sim1.setCost(3000);
		sim1.setName("Jspiders");
		sim1.setProvider("Gio");
		
		Mobile_ManyToOne mob = new Mobile_ManyToOne();
		mob.setBrand("Apple");
		mob.setCost(79000);
		
		sim.setMobi(mob);
		sim1.setMobi(mob);
		
		et1.begin();
		em1.persist(sim1);
		em1.persist(sim);
		em1.persist(mob);
		et1.commit();
	}

}
