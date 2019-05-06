package pe.edu.cibertec.modelo;

import java.util.Date;

public class Actor extends Persona{

	private String nomArtistico;
	private String nacionalidad;
	private String foto;
	
	public Actor() {
		
	}
	
	public Actor(Integer id,String nombre, String apePaterno, String apeMaterno, Date fecNacimiento, int edad, String sexo,
			String nomArtistico, String nacionalidad, String foto) {
		super(id,nombre, apePaterno, apeMaterno, fecNacimiento, edad, sexo);
		this.nomArtistico = nomArtistico;
		this.nacionalidad = nacionalidad;
		this.foto = foto;
	}

	public String getNomArtistico() {
		return nomArtistico;
	}

	public void setNomArtistico(String nomArtistico) {
		this.nomArtistico = nomArtistico;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
