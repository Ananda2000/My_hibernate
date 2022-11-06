package com.Hibernate.OneToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPan_customer
{
	public static void main(String [] args)
	{
		EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("vikas");
		EntityManager em1= emf1.createEntityManager();
		EntityTransaction et1 = em1.getTransaction();
		
		Customer cus = new Customer();
		cus.setAddress("address1");
		cus.setName("Jspiders");
		
		Pancard pan = new Pancard();
		pan.setName("pan name jspiders");
		pan.setPanno(23456);
		cus.setPan(pan);
		
		et1.begin();
		em1.persist(cus);
		em1.persist(pan);
		
		et1.commit();
	}

}
