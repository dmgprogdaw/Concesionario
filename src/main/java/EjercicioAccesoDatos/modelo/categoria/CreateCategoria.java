package EjercicioAccesoDatos.modelo.categoria;

import javax.persistence.EntityManager;

import EjercicioAccesoDatos.modelo.util.ConnectionEntityManagerFactory;
import EjercicioAccesoDatos.negocio.CategoriaBean;

public class CreateCategoria {

	
	public void create(CategoriaBean categoria) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(categoria);
		entityManager.getTransaction().commit();
	}
}
