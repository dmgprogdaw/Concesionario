package EjercicioAccesoDatos.inicio;

import EjercicioAccesoDatos.modelo.categoria.CreateCategoria;
import EjercicioAccesoDatos.modelo.coche.CreateCoche;
import EjercicioAccesoDatos.modelo.concesionario.CreateConcesionario;
import EjercicioAccesoDatos.modelo.reparacion.CreateReparaciones;
import EjercicioAccesoDatos.modelo.trabajador.CreateTrabajador;
import EjercicioAccesoDatos.modelo.util.ConnectionEntityManagerFactory;
import EjercicioAccesoDatos.negocio.CategoriaBean;
import EjercicioAccesoDatos.negocio.CocheBean;
import EjercicioAccesoDatos.negocio.ConcesionarioBean;
import EjercicioAccesoDatos.negocio.ReparacionesBean;
import EjercicioAccesoDatos.negocio.TrabajadorBean;

public class Start {

	public static void main(String[] args) {

		/**** INSERTAMOS CONCESIONARIOS ******/
		
		ConcesionarioBean concesionario1 = new ConcesionarioBean();
		concesionario1.setCif("CON-001");
		concesionario1.setNombre("Concesionario1");
		concesionario1.setLocalidad("Oviedo");
		concesionario1.setProvinvia("Asturias");
		concesionario1.setTelefono("123456789");
		
		/**** INSERTAMOS COCHES ******/
		
		CocheBean coche1 = new CocheBean();
		coche1.setBastidor("12345678985214785963N");
		coche1.setModelo("León");
		coche1.setColor("Rojo");
		coche1.setPlazas(5);
		coche1.setCaballos(200);
		coche1.setPrecioMinimo(19270.00);
		
		CocheBean coche2 = new CocheBean();
		coche2.setBastidor("74125896315753245684V");
		coche2.setModelo("C5");
		coche2.setColor("Azul");
		coche2.setPlazas(5);
		coche2.setCaballos(182);
		coche2.setPrecioMinimo(18500.00);
		
		CocheBean coche3 = new CocheBean();
		coche3.setBastidor("74125896315753245684W");
		coche3.setModelo("C4");
		coche3.setColor("Verde");
		coche3.setPlazas(5);
		coche3.setCaballos(180);
		coche3.setPrecioMinimo(18000.00);
		
		/**** INSERTAMOS CATEGORIAS ******/
		
		CategoriaBean gerente = new CategoriaBean();
		gerente.setCategoria("Gerente");
		gerente.setAumento(500);
		
		CategoriaBean responsable = new CategoriaBean();
		responsable.setCategoria("Responsable");
		responsable.setAumento(350);
		
		CategoriaBean jefeTaller = new CategoriaBean();
		jefeTaller.setCategoria("Jefe de Taller");
		jefeTaller.setAumento(250);
		
		CategoriaBean mecanico = new CategoriaBean();
		mecanico.setCategoria("Mecánico");
		mecanico.setAumento(100);
		
		CategoriaBean vendedor = new CategoriaBean();
		vendedor.setCategoria("Vendedor");
		vendedor.setAumento(150);
		
		CategoriaBean aprendiz = new CategoriaBean();
		aprendiz.setCategoria("Aprendiz");
		aprendiz.setAumento(0);
		
		/**** INSERTAMOS TRABAJADORES ******/
		
		TrabajadorBean trabajador1 = new TrabajadorBean();
		trabajador1.setDni("77145898A");
		trabajador1.setNombre("Pedro");
		trabajador1.setApellidos("Gutierrez Fernandez");
		trabajador1.setDireccion("Oviedo");
		trabajador1.setLocalidad("Oviedo");
		trabajador1.setProvincia("Asturias");
		trabajador1.setTelefono("147896523");
		trabajador1.setSueldoBase(1600.00);
		trabajador1.setConcesionario(concesionario1);
		trabajador1.setCategoria(gerente);
		
		TrabajadorBean trabajador2 = new TrabajadorBean();
		trabajador2.setDni("75778968L");
		trabajador2.setNombre("Alba");
		trabajador2.setApellidos("Gutierrez Gutierrez");
		trabajador2.setDireccion("Moreda");
		trabajador2.setLocalidad("Moreda");
		trabajador2.setProvincia("Asturias");
		trabajador2.setTelefono("789456123");
		trabajador2.setSueldoBase(2500.00);
		trabajador2.setConcesionario(concesionario1);
		trabajador2.setCategoria(aprendiz);

		/**** INSERTAMOS REPARACIONES ******/
		
		ReparacionesBean reparacion1 = new ReparacionesBean();
		reparacion1.setBastidor(coche1);
		reparacion1.setColor(coche1);
		reparacion1.setMatricula("HOL 900");
		reparacion1.setModelo(coche1);
		reparacion1.setMarca("Seat");
		reparacion1.setDescripcionAveria("Luna delantera resquebrajada");
		reparacion1.setPresupuesto(500.00);
				
		/**** AÑADIMOS LOS COCHES A LA LISTA DE COCHES DE CADA CONCESIONARIO ******/
		
		concesionario1.addCoche(coche1);
		concesionario1.addCoche(coche2);
		
		/**** AÑADIMOS LOS TRABAJADORES A LA LISTA DE TRABAJADORES DE CADA CONCESIONARIO ******/
		
		concesionario1.addTrabajador(trabajador1);
		concesionario1.addTrabajador(trabajador2);
		
		/**** AÑADIMOS LOS TRABAJADORES A LA LISTA DE TRABAJADORES DE CADA CATEGORIA ******/
		
		gerente.addTrabajador(trabajador1);
		aprendiz.addTrabajador(trabajador2);
		
		/**** CREAMOS LOS CONCESIONARIOS ******/
		
		CreateConcesionario concesionario = new CreateConcesionario();
		concesionario.create(concesionario1);	
		
		/**** CREAMOS LOS COCHES ******/
		
		CreateCoche coche = new CreateCoche();
		coche.create(coche1);
		coche.create(coche2);
		coche.create(coche3);
		
		/**** CREAMOS LAS CATEGORIAS ******/
		
		CreateCategoria categoria = new CreateCategoria();
		categoria.create(gerente);
		categoria.create(jefeTaller);
		categoria.create(responsable);
		categoria.create(mecanico);
		categoria.create(vendedor);
		categoria.create(aprendiz);
		
		/**** CREAMOS LOS TRABAJADORES ******/
		
		CreateTrabajador trabajador = new CreateTrabajador();
		trabajador.create(trabajador1);
		trabajador.create(trabajador2);
		
		/**** CREAMOS LAS REPARACIONES ******/
		
		CreateReparaciones reparacion = new CreateReparaciones();
		reparacion.create(reparacion1);
		
		
		
		
		ConnectionEntityManagerFactory.getEntityManagerFactory().close();
	}
}
