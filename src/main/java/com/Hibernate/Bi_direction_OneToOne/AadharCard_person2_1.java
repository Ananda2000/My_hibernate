package com.Hibernate.Bi_direction_OneToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AadharCard_person2_1 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		
		
		Person2782020_1 person = new Person2782020_1();
		AadharCard_27082022_1 aadharCd = new AadharCard_27082022_1();
		

		person.setAge(30);
		person.setName("Ananda");
				

		aadharCd.setAddress("lsdlkj lsijljsld");

		
		
		person.setAadharCard_27082022_1(aadharCd);
		aadharCd.setPerson_1(person);
		
		et.begin();
		
		em.persist(person);
		em.persist(aadharCd);
		et.commit();
    
		
	}

}
