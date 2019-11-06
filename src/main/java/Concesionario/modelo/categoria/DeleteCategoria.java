package Concesionario.modelo.categoria;

import javax.persistence.EntityManager;

import Concesionario.modelo.util.ConnectionEntityManagerFactory;
import Concesionario.negocio.CategoriaBean;

public class DeleteCategoria {

	
	public void delete(CategoriaBean coche) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		CategoriaBean categoriaBorrar = entityManager.find(CategoriaBean.class, coche.getId());	
		entityManager.remove(categoriaBorrar);
		entityManager.getTransaction().commit();
	}
}
