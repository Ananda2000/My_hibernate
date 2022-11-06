package com.Hibernate.ManyToManyBidirection_2882022;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mobsim_joining {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Mobile_28 mob28 = new Mobile_28();
		Sim28 sim28 = new Sim28();

		mob28.setBrand("Apple1");
		mob28.setCost(89478);

		Mobile_28 mob28_1 = new Mobile_28();
		mob28_1.setBrand("Samsung1");
		mob28_1.setCost(786454);

		List<Mobile_28> mobb = new ArrayList<Mobile_28>();
		mobb.add(mob28);
		mobb.add(mob28_1);

		sim28.setProvider("Airtel");
		sim28.setType("5G");

		Sim28 sim28_1 = new Sim28();
		sim28_1.setProvider("Jio");
		sim28_1.setType("6G");

		List<Sim28> simm = new ArrayList<Sim28>();
		simm.add(sim28);
		simm.add(sim28_1);

		mob28.setSim28(simm);
		sim28.setMobile28(mobb);
		
		Mobile_28 mobDele = em.find(Mobile_28.class, 4);
		if(mobDele!=null)
		{
		et.begin();
		
		//em.remove(mob28);
		em.remove(mobDele);

		et.commit();
		}
		/*em.persist(sim28_1);
		em.persist(sim28);
*/

	}

}
