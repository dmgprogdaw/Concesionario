package EjercicioAccesoDatos.inicio;

import EjercicioAccesoDatos.modelo.coche.CreateCoche;
import EjercicioAccesoDatos.modelo.concesionario.CreateConcesionario;
import EjercicioAccesoDatos.modelo.reparacion.CreateReparaciones;
import EjercicioAccesoDatos.modelo.trabajador.CreateTrabajador;
import EjercicioAccesoDatos.modelo.util.ConnectionEntityManagerFactory;
import EjercicioAccesoDatos.negocio.CocheBean;
import EjercicioAccesoDatos.negocio.ConcesionarioBean;
import EjercicioAccesoDatos.negocio.ReparacionesBean;
import EjercicioAccesoDatos.negocio.TrabajadorBean;

public class Start {

	public static void main(String[] args) {

		
		ConcesionarioBean concesionario1 = new ConcesionarioBean();
		concesionario1.setCif("CON-001");
		concesionario1.setNombre("Concesionario1");
		concesionario1.setLocalidad("Oviedo");
		concesionario1.setProvinvia("Asturias");
		concesionario1.setTelefono("123456789");
		
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
		
		TrabajadorBean trabajador1 = new TrabajadorBean();
		trabajador1.setDni("77145898A");
		trabajador1.setNombre("Pedro");
		trabajador1.setApellidos("Gutierrez Fernandez");
		trabajador1.setDireccion("Oviedo");
		trabajador1.setLocalidad("Oviedo");
		trabajador1.setProvincia("Asturias");
		trabajador1.setTelefono("147896523");
		trabajador1.setSueldoBase(1600.00);
		trabajador1.setCategoria("Gerente");
		trabajador1.addPlus("Gerente", 1600.00);
		trabajador1.getSueldoFinal();
		
		TrabajadorBean trabajador2 = new TrabajadorBean();
		trabajador2.setDni("75778968L");
		trabajador2.setNombre("Alba");
		trabajador2.setApellidos("Gutierrez Gutierrez");
		trabajador2.setDireccion("Moreda");
		trabajador2.setLocalidad("Moreda");
		trabajador2.setProvincia("Asturias");
		trabajador2.setTelefono("789456123");
		trabajador2.setSueldoBase(2500.00);
		trabajador2.setCategoria("Aprendiz");
		trabajador2.addPlus("Aprendiz", 2500.00);
		trabajador2.getSueldoFinal();
	
		ReparacionesBean reparacion1 = new ReparacionesBean();
		reparacion1.setBastidor(coche1);
		reparacion1.setColor(coche1);
		reparacion1.setMatricula("HOL 900");
		reparacion1.setModelo(coche1);
		reparacion1.setMarca("Seat");
		reparacion1.setDescripcionAveria("Luna delantera resquebrajada");
		reparacion1.setPresupuesto(500.00);
				
		concesionario1.addCoche(coche1);
		concesionario1.addCoche(coche2);
		
		CreateConcesionario concesionario = new CreateConcesionario();
		concesionario.create(concesionario1);	
		
		CreateCoche coche = new CreateCoche();
		coche.create(coche1);
		coche.create(coche2);
		coche.create(coche3);
		
		CreateTrabajador trabajador = new CreateTrabajador();
		trabajador.create(trabajador1);
		trabajador.create(trabajador2);
		
		CreateReparaciones reparacion = new CreateReparaciones();
		reparacion.create(reparacion1);
		
		ConnectionEntityManagerFactory.getEntityManagerFactory().close();
	}
}
