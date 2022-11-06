package com.Hibernate.OneToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonAdhar 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person per = new Person();
			per.setAge(23);
			per.setName("Anand");
			//per.setAdhr(nu);
			
			AdharCard adhr = new AdharCard();
			adhr.setAddress("vijayanager unitstate of america");
			adhr.setAdno(234561);
			per.setAdhr(adhr);
			
			et.begin();
			em.persist(per);
			em.persist(adhr);
			et.commit();
	}

}
