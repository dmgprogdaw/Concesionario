package EjercicioAccesoDatos.modelo.categoria;

import javax.persistence.EntityManager;

import EjercicioAccesoDatos.modelo.util.ConnectionEntityManagerFactory;
import EjercicioAccesoDatos.negocio.CategoriaBean;

public class DeleteCategoria {

	
	public void delete(CategoriaBean coche) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		CategoriaBean categoriaBorrar = entityManager.find(CategoriaBean.class, coche.getId());	
		entityManager.remove(categoriaBorrar);
		entityManager.getTransaction().commit();
	}
}
