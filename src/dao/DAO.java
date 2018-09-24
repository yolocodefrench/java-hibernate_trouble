package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Agence;
import entity.CompteSimple;

public class DAO {
	public void createDatabse(){
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction tx = em.getTransaction();
	        
	        Agence agence = new Agence("Jeuisunetrea", "18 la sablere");
	        tx.begin();
	        
	        em.persist(agence);
	        tx.commit();
	}

}
