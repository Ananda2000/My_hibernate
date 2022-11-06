package com.ty;

import java.util.Map;

import javax.persistence.Cache;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.Query;
import javax.persistence.SynchronizationType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;

public class DeleteStudentRecord 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager e_manager = emfactory.createEntityManager();
		EntityTransaction e_transaction = e_manager.getTransaction();
		
		Student std = e_manager.find(Student.class, 1);
		if(std!=null)
		{
			e_transaction.begin();
		}
			e_manager.remove(std);
			e_transaction.commit();
		}
		
}
