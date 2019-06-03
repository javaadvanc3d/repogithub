package pe.edu.cibertec.dominio;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import pe.edu.cibertec.modelo.Entidad;

@Entity
public class Multimedia extends Entidad{
	
	/* Todos estos campos deben ser mapeados en la Entidad Multimedia:
	 
		id	int(11)
		titulo	varchar(50)
		des_corta	varchar(60)
		des_larga	varchar(120)
		id_tipo	int(11)
		id_genero	int(11)
		anio	int(11)
		temporada	int(11)
		duracion	int(11)
		capitulos	int(11)
		puntuacion	decimal(2,0)
		portada	mediumblob
		url_acceso	varchar(100)
	*/
	
	
	private String titulo;
	
	@Column(name="des_corta")
	private String desCorta;
	
	@Column(name="des_larga")
	private String desLarga;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="id_tipo")
	private TipoMultimedia tipo;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="id_genero")
	private Genero genero;
	
	private int anio;
	private int temporada;
	private int duracion;
	private int capitulos;
	private BigDecimal puntuacion;
	
	private String portada;
	
	@Column(name="url_acceso")
	private String urlAcceso;

	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDesCorta() {
		return desCorta;
	}

	public void setDesCorta(String desCorta) {
		this.desCorta = desCorta;
	}

	public String getDesLarga() {
		return desLarga;
	}

	public void setDesLarga(String desLarga) {
		this.desLarga = desLarga;
	}

	public TipoMultimedia getTipo() {
		return tipo;
	}

	public void setTipo(TipoMultimedia tipo) {
		this.tipo = tipo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}

	public BigDecimal getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(BigDecimal puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	public String getUrlAcceso() {
		return urlAcceso;
	}

	public void setUrlAcceso(String urlAcceso) {
		this.urlAcceso = urlAcceso;
	}
	
}
