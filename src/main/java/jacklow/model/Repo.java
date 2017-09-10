package jacklow.model;

import javax.persistence.EntityManager;

import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

public class Repo {

	public Vehiculo findById(long l) {
		
		EntityManager entityManager = PerThreadEntityManagers.getEntityManager();
		
		return entityManager.find(Vehiculo.class, new Long(l));
	}

}
