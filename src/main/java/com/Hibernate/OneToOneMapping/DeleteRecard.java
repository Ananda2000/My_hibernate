package com.Hibernate.OneToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteRecard 
{
	public static void main(String[] args) {
		EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("vikas");
		EntityManager em2 = emf2.createEntityManager();
		EntityTransaction et2 = em2.getTransaction();
		
		Person pers = em2.find(Person.class, 3);
		et2.begin();
		em2.remove(pers);
		et2.commit();
		
	}

}
