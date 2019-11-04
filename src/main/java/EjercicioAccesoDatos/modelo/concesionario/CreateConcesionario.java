package EjercicioAccesoDatos.modelo.concesionario;

import javax.persistence.EntityManager;

import EjercicioAccesoDatos.modelo.util.ConnectionEntityManagerFactory;
import EjercicioAccesoDatos.negocio.ConcesionarioBean;

public class CreateConcesionario {

	
	public void create(ConcesionarioBean concesionario) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(concesionario);
		entityManager.getTransaction().commit();
	}
}
