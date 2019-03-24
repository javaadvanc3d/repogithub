package pe.edu.cibertec.modelo;

public class Comentarios {

	private int codigoComentario;
	private String comentario; 
	private Multimedia CodigoMultimedia;
	private Usuario codigoUsuario;
	
	public Comentarios(int codigoComentario, String comentario, Multimedia codigoMultimedia, Usuario codigoUsuario) {
	
		this.codigoComentario = codigoComentario;
		this.comentario = comentario;
		CodigoMultimedia = codigoMultimedia;
		this.codigoUsuario = codigoUsuario;
	}

	public int getCodigoComentario() {
		return codigoComentario;
	}

	public void setCodigoComentario(int codigoComentario) {
		this.codigoComentario = codigoComentario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Multimedia getCodigoMultimedia() {
		return CodigoMultimedia;
	}

	public void setCodigoMultimedia(Multimedia codigoMultimedia) {
		CodigoMultimedia = codigoMultimedia;
	}

	public Usuario getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Usuario codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
