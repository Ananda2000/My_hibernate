package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

//import com.mysql.cj.Query;

public class REad_allDataFromDb 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em =emf.createEntityManager();
		Query query =em.createQuery("select s from Student s");
		List<Student> alist = query.getResultList();
		for(int i=0;i<alist.size();i++)
		{
			System.out.print(alist.get(i).getId());
			System.out.println(alist.get(i).getName());
		}
		
		for (Student student : alist) {
			System.out.println("The id --"+student.getId());
			System.out.println("The name --"+student.getName());
			System.out.println("--------------------------------");
			
		}
	}

}
