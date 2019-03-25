package pe.edu.cibertec.modelo;

public class Multimedia {
	
	private String titulo;
	private String descripcion;
    private String tipo;
	private int duracion;
	private String año;
	private int temporada;
	private int numCapitulos;
	private String codFormato;
	private String codRestricion;
	private String urlAcceso;
	
	public Multimedia(String titulo, String descripcion, String tipo, int duracion, String año, int temporada,
			int numCapitulos, String codFormato, String codRestricion, String urlAcceso) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.duracion = duracion;
		this.año = año;
		this.temporada = temporada;
		this.numCapitulos = numCapitulos;
		this.codFormato = codFormato;
		this.codRestricion = codRestricion;
		this.urlAcceso = urlAcceso;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public int getTemporada() {
		return temporada;
	}
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	public int getNumCapitulos() {
		return numCapitulos;
	}
	public void setNumCapitulos(int numCapitulos) {
		this.numCapitulos = numCapitulos;
	}
	public String getCodFormato() {
		return codFormato;
	}
	public void setCodFormato(String codFormato) {
		this.codFormato = codFormato;
	}
	public String getCodRestricion() {
		return codRestricion;
	}
	public void setCodRestricion(String codRestricion) {
		this.codRestricion = codRestricion;
	}
	public String getUrlAcceso() {
		return urlAcceso;
	}
	public void setUrlAcceso(String urlAcceso) {
		this.urlAcceso = urlAcceso;
	}

}
