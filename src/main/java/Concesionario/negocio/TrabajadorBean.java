package Concesionario.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.UniqueConstraint;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

@Entity
@Table(name="trabajadores", uniqueConstraints = @UniqueConstraint(columnNames= {"dni", "telefono"}))
public class TrabajadorBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="numTrabajador")
	private long id; 
	
	@ManyToOne
	@JoinColumn(name="FK_concesionario")
	private ConcesionarioBean concesionario;
	
	@ManyToOne
	@JoinColumn(name="FK_categoria")
	private CategoriaBean categoria;
	
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
	

	public ConcesionarioBean getConcesionario() {
		return concesionario;
	}


	public void setConcesionario(ConcesionarioBean concesionario) {
		this.concesionario = concesionario;
	}


	public CategoriaBean getCategoria() {
		return categoria;
	}


	public void setCategoria(CategoriaBean categoria) {
		this.categoria = categoria;
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
}
