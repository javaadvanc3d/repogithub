package pe.edu.cibertec.modelo;

public class Usuario {
	private String userName;
	private String correo;
	private String contrasena;
	private String numeroTelefono;
	private int codigoUsuario;

	public Usuario(String userName, String correo, String contrasena, String numeroTelefono, int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
		this.userName = userName;
		this.correo = correo;
		this.contrasena = contrasena;
		this.numeroTelefono = numeroTelefono;
	}

	public String getUserName() {
		return userName;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

}
