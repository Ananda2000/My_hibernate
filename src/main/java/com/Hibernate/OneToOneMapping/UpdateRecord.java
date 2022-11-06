package com.Hibernate.OneToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecord 
{
public static void main(String[] args) 
{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Person pDelete = em.find(Person.class, 5);
	pDelete.setName("kumar updated name updated 2nd time");
	
	et.begin();
	em.merge(pDelete);
	et.commit();
	
	
	
	
}

}
