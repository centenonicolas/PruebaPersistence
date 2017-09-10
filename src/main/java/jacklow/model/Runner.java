package jacklow.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Assert;
import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import jacklow.model.eventos.Evento;
import jacklow.model.eventos.MovilAsignado;
import jacklow.model.eventos.VehiculoDetectado;


public class Runner {
/*
	public static void main(String[] args) {
		EntityManager entityManager = PerThreadEntityManagers.getEntityManager();
		
		//Vehiculo vehiculo = entityManager.find(Vehiculo.class, new Long(1));
		
		//Si vuelve a pedir el mismo vehiculo (1) te devuelve la misma instancia en lugar de una instancia nueva
		//no vuelve a buscar en la base sino que te trae el que ya habias traido anteriormente
		PerThreadEntityManagers.getEntityManager().clear();
		
		EntityTransaction tx = PerThreadEntityManagers.getEntityManager().getTransaction();
		
		Robo robo = entityManager.find(Robo.class, new Long(2));
		
		Assert.assertNotNull(robo.getVehiculo());
		
		//entityManager.clear();
		System.out.println(robo.getVehiculo().getVtu());
		tx.begin();
		
		Repo repo = new Repo();
		//Vehiculo vehiculo1 = repo.findById(1l);
		//Vehiculo vehiculo = new Vehiculo("vtu","ABC 123");
		//entityManager.persist(vehiculo);
		
		
		Robo robo = new Robo();
		Vehiculo vehiculo = entityManager.find(Vehiculo.class, new Long(3));
		robo.setVehiculo(vehiculo);
		
		entityManager.persist(robo);
		tx.commit(); //es el commit el que genera la persistencia (hace el insert)
		
		
		//vehiculo.setVtu("123456");
		//El ORM automaticamente ejecuta un update(Hibernate) al hacer un commit
		
		
		
		//System.out.println(vehiculo);
		
		}
*/

	
	public static void main(String[] args) {
		EntityManager entityManager = PerThreadEntityManagers.getEntityManager();

		Evento evento = entityManager.find(Evento.class, new Long(1));
		
	
	}

	public void all() {
		PerThreadEntityManagers.getEntityManager().createQuery("from Vehiculo"
			+ "where patente=123").getResultList();
	}
	
}
	
