package com.Hibernate.OneToMany_Mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Sim sm = em.find(Sim.class, 1);
		
		
		if(sm!=null)
		{
			sm.setProvider("anand kumar-1 ");
			sm.setType("Anand tipe edited");
			et.begin();
			em.merge(sm);
			et.commit();
		}
		else {
			System.out.println("The Does not exists");
		}
		
		
	}

}
