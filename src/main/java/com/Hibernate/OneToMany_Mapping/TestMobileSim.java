package com.Hibernate.OneToMany_Mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMobileSim 
{
public static void main(String[] args) {
	

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Mobile mob = new Mobile();
		mob.setBrand("Apple-1");
		mob.setCost(584942);
		
		Sim sm = new Sim();
		sm.setProvider("GIO");
		sm.setType("network");
		
		Sim sm1 = new Sim();
		sm1.setProvider("Airtel");
		sm1.setType("airtel type");
		
		List<Sim> lsim= new ArrayList<Sim>();
		lsim.add(sm);
		lsim.add(sm1);
		mob.setSims(lsim);
		
		et.begin();
		em.persist(sm);
		em.persist(sm1);
		em.persist(mob);
		
		et.commit();
		
	}

}
