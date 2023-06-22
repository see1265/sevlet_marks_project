package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import dto.DtoStd;

public class Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public String insert(DtoStd d1) {
		et.begin();
		em.persist(d1);
		et.commit();
		return "add";
	}
	public DtoStd find(long sid) {
		DtoStd q1=em.find(DtoStd.class, sid);
		return q1;
	}
}
