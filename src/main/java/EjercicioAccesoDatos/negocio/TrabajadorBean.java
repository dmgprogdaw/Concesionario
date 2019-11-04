package EjercicioAccesoDatos.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.UniqueConstraint;
import javax.persistence.Column;

@Entity
@Table(name="trabajadores", uniqueConstraints = @UniqueConstraint(columnNames= {"dni", "telefono"}))
public class TrabajadorBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="numTrabajador")
	private long id; 
	
	@Column
	private String dni;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String direccion;
	
	@Column
	private String localidad;
	
	@Column
	private String provincia;
	
	@Column
	private String telefono;
	
	@Column
	private double sueldoBase;
	
	@Column
	private double sueldoFinal;
	
	@Column
	private String categoria;
	
	@ManyToOne
	private ConcesionarioBean concesionario;
	

	public double addPlus(String categoria, double sueldoBase) {
		
		if(categoria == "Gerente")
			sueldoFinal = sueldoBase + 500;
		if(categoria == "Responsable")
			sueldoFinal = sueldoBase + 350;
		if(categoria == "Jefe de Taller")	
			sueldoFinal = sueldoBase + 250;
		if(categoria == "Mecánico")
			sueldoFinal = sueldoBase + 100;
		if(categoria == "Vendedor")		
			sueldoFinal = sueldoBase + 150;
		if(categoria == "Aprendiz")
			sueldoFinal = sueldoBase + 0;
		return sueldoFinal;
	}

	public ConcesionarioBean getConcesioario() {
		return concesionario;
	}

	public void setConcesioario(ConcesionarioBean concesionario) {
		this.concesionario = concesionario;
	}
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public double getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}
}
