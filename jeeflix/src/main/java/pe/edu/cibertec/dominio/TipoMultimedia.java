package pe.edu.cibertec.dominio;

import javax.persistence.Entity;
import javax.persistence.Table;

import pe.edu.cibertec.modelo.Entidad;

@Entity
@Table(name= "tipo_multimedia") 
public class TipoMultimedia extends Entidad{

	private String nombre;

	public TipoMultimedia() {
	}

	public TipoMultimedia(Integer id, String nombre) {
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
