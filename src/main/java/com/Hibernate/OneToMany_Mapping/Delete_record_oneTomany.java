package com.Hibernate.OneToMany_Mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_record_oneTomany 
{
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Mobile mobdel = em.find(Mobile.class, 1);
		if(mobdel !=null)
		{
			et.begin();
			em.remove(mobdel);
			et.commit();
			System.out.println("========================================================");
			System.out.println("The record deleted successfully");
		}
		else {
			System.out.println("The record does not exist");
		}
		
		
		
	}

}
