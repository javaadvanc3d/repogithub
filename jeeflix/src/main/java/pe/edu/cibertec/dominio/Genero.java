package pe.edu.cibertec.dominio;

import javax.persistence.Entity;
import javax.persistence.Table;

import pe.edu.cibertec.modelo.Entidad;

@Entity
@Table(name= "genero")
public class Genero extends Entidad{
	
	private String nombre;

	public Genero() {
	}

	public Genero(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
