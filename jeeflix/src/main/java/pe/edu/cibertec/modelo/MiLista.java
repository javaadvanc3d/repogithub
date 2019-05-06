package pe.edu.cibertec.modelo;

public class MiLista {
	
	private int codigoMiLista;
	private String Contenido;
	private Usuario codigoUsuario;
	
	public MiLista(int codigoMiLista, String contenido, Usuario codigoUsuario) {
		
		this.codigoMiLista = codigoMiLista;
		Contenido = contenido;
		this.codigoUsuario = codigoUsuario;
	}

	public int getCodigoMiLista() {
		return codigoMiLista;
	}

	public void setCodigoMiLista(int codigoMiLista) {
		this.codigoMiLista = codigoMiLista;
	}

	public String getContenido() {
		return Contenido;
	}

	public void setContenido(String contenido) {
		Contenido = contenido;
	}

	public Usuario getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Usuario codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
	
	
	

}
