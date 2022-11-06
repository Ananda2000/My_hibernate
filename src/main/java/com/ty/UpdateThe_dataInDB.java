package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateThe_dataInDB 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction e_transaction = em.getTransaction();
		
		Student std_merge = em.find(Student.class, 23);
		
		std_merge.setName("Anand");
		

		e_transaction.begin();
		em.merge(std_merge);
		e_transaction.commit();
		
		
	}

}
