package pe.edu.cibertec.modelo;

public class Puntuacion {
	
	private int codigoPuntuacion;
	private int valorPuntuacion;
	private Multimedia codigoMultimedia;
	
	public Puntuacion(int codigoPuntuacion, int valorPuntuacion, Multimedia codigoMultimedia) {
		
		this.codigoPuntuacion = codigoPuntuacion;
		this.valorPuntuacion = valorPuntuacion;
		this.codigoMultimedia = codigoMultimedia;
	}

	public int getCodigoPuntuacion() {
		return codigoPuntuacion;
	}

	public void setCodigoPuntuacion(int codigoPuntuacion) {
		this.codigoPuntuacion = codigoPuntuacion;
	}

	public int getValorPuntuacion() {
		return valorPuntuacion;
	}

	public void setValorPuntuacion(int valorPuntuacion) {
		this.valorPuntuacion = valorPuntuacion;
	}

	public Multimedia getCodigoMultimedia() {
		return codigoMultimedia;
	}

	public void setCodigoMultimedia(Multimedia codigoMultimedia) {
		this.codigoMultimedia = codigoMultimedia;
	}
	
	
	
	

}
