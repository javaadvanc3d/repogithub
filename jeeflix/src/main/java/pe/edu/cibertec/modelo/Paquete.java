package pe.edu.cibertec.modelo;

public class Paquete {

	private String nombrePaquete;
	private String descripcion;
	
	
	public Paquete(String nombrePaquete, String descripcion) {
		this.nombrePaquete = nombrePaquete;
		this.descripcion = descripcion;
	}
	public String getNombrePaquete() {
		return nombrePaquete;
	}
	public void setNombrePaquete(String nombrePaquete) {
		this.nombrePaquete = nombrePaquete;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
}
