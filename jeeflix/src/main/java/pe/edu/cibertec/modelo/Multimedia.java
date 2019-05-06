package pe.edu.cibertec.modelo;

public class Multimedia  extends Entidad{
	
	private String titulo;
	private String descripCorta;
	private String descripLarga;
	private double puntuacion;
    private String tipo;
    private int genero;
	private int duracion;
	private String año;
	private int temporada;
	private int numCapitulos;
	private String codFormato;
	private String codRestricion;
	private String urlImg;
	private String urlAcceso;
	
	public Multimedia() {
		
	}

	public Multimedia(Integer id, String titulo, String descripCorta, String descripLarga, double puntuacion, String tipo,
			int genero, int duracion, String año, int temporada, int numCapitulos, String codFormato,
			String codRestricion, String urlImg, String urlAcceso) {
		this.id = id;
		this.titulo = titulo;
		this.descripCorta = descripCorta;
		this.descripLarga = descripLarga;
		this.puntuacion = puntuacion;
		this.tipo = tipo;
		this.genero = genero;
		this.duracion = duracion;
		this.año = año;
		this.temporada = temporada;
		this.numCapitulos = numCapitulos;
		this.codFormato = codFormato;
		this.codRestricion = codRestricion;
		this.urlImg = urlImg;
		this.urlAcceso = urlAcceso;
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescripCorta() {
		return descripCorta;
	}
	public void setDescripCorta(String descripCorta) {
		this.descripCorta = descripCorta;
	}
	public String getDescripLarga() {
		return descripLarga;
	}
	public void setDescripLarga(String descripLarga) {
		this.descripLarga = descripLarga;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
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
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public String getUrlAcceso() {
		return urlAcceso;
	}
	public void setUrlAcceso(String urlAcceso) {
		this.urlAcceso = urlAcceso;
	}

}
