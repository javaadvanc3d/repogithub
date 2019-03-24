package pe.edu.cibertec.modelo;

public class Genero {
	
	private int coidgoGenero;
	private String nombreGenero;
	
	public Genero(int coidgoGenero, String nombreGenero) {
		
		this.coidgoGenero = coidgoGenero;
		this.nombreGenero = nombreGenero;
	}

	public int getCoidgoGenero() {
		return coidgoGenero;
	}

	public void setCoidgoGenero(int coidgoGenero) {
		this.coidgoGenero = coidgoGenero;
	}

	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}
	
	
	
}
