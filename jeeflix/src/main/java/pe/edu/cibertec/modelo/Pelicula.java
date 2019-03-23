package pe.edu.cibertec.modelo;

public class Pelicula {
	private final String titulo;
	private final int duracion;
	private final String genero;
	private final String director;
	
	public Pelicula(String titulo, int duracion, String genero, String director) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
		this.director = director;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public String getGenero() {
		return genero;
	}
	public String getDirector() {
		return director;
	}
	
}
