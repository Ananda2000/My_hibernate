package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//import 

public class SaveStudent 
{
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction ent = em.getTransaction();
	
	Student student = new Student();
	student.setId(25);
	student.setName("venu-23");
          
	ent.begin();
	
	em.persist(student);
	
	ent.commit();
	

}
}