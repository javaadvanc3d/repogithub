package pe.edu.cibertec.modelo;

import java.util.Date;

public class Suscripcion {
	private Usuario usuario;
	private Paquete paquete;
	private int codigoFormaPago;
	private Date fechaCorte;
	
	public Suscripcion(Usuario usuario, Paquete paquete, int codigoFormaPago, Date fechaCorte) {
		this.usuario = usuario;
		this.paquete = paquete;
		this.codigoFormaPago = codigoFormaPago;
		this.fechaCorte = fechaCorte;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Paquete getPaquete() {
		return paquete;
	}
	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	public int getCodigoFormaPago() {
		return codigoFormaPago;
	}
	public void setCodigoFormaPago(int codigoFormaPago) {
		this.codigoFormaPago = codigoFormaPago;
	}
	public Date getFechaCorte() {
		return fechaCorte;
	}
	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}
	
	
	
}