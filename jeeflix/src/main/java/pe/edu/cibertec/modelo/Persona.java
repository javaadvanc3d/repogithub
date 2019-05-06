package pe.edu.cibertec.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona extends Entidad {

	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private Date fecNacimiento;
	private int edad;
	private String sexo;
	
	public Persona() {
		
	}

	public Persona(Integer id, String nombre, String apePaterno, String apeMaterno, Date fecNacimiento, int edad,
			String sexo) {
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.fecNacimiento = fecNacimiento;
		this.edad = edad;
		this.sexo = sexo;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public Date getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFecNacimientoFormato() {
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return fecNacimiento!=null?simpleDateFormat.format(fecNacimiento):null;
	}

	public void setFecNacimientoFormato(String fecNacimientoFormato) {
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		try {
			Date date = simpleDateFormat.parse(fecNacimientoFormato);
			this.fecNacimiento = date;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
