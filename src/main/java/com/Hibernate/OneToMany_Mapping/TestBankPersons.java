package com.Hibernate.OneToMany_Mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestBankPersons 
{
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person3 per3 = new Person3();
		per3.setName("Ananda");
		per3.setAddress("jspdiers , vijayanager");
		
		Bank bnk = new Bank();
		bnk.setBname("SBI");
		bnk.setLocation("mysore");
		
		Bank bnk1 = new Bank();
		bnk1.setBname("ICICI");
		bnk1.setLocation("Kolkotta");
		
		List<Bank> blist = new ArrayList<Bank>();
		blist.add(bnk);
		blist.add(bnk1);
		per3.setBanks(blist);

		et.begin();
		em.persist(bnk1);
		em.persist(bnk);
		em.persist(per3);

		et.commit();
	}

}
