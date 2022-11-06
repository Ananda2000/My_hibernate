package com.Hibernate.OneToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteAadharEntryInperson 
{
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//Person pdelete = em.find(Person.class, 6);
		AdharCard adhr = em.find(AdharCard.class, 234561);
		if(adhr!=null)
		{
			et.begin();
			em.remove(adhr);
			et.commit();
		}
		else {
			System.out.println("The record does not exists..");
		}
	}

}
