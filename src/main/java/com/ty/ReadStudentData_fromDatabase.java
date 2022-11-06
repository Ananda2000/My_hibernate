package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadStudentData_fromDatabase 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		//This "vikas name is fetching from persistence.xml file "META-INF""
		
		EntityManager em = emf.createEntityManager();
		
		Student std = em.find(Student.class, 2);
		if(std!=null)
		{
			System.out.println("The id --"+std.getId());
			System.out.println("The name is --"+std.getName());
		}
		else
		{
			System.out.println("The data not found");
		}
		
	}

}
