package pe.edu.cibertec.modelo;

public class TipoMultimedia {
	
	
	private int codigoTipoMltimedia;
	private String  nombreMultimedia;
	
	public TipoMultimedia(int codigoTipoMltimedia, String nombreMultimedia) {
		this.codigoTipoMltimedia = codigoTipoMltimedia;
		this.nombreMultimedia = nombreMultimedia;
	}

	public int getCodigoTipoMltimedia() {
		return codigoTipoMltimedia;
	}

	public void setCodigoTipoMltimedia(int codigoTipoMltimedia) {
		this.codigoTipoMltimedia = codigoTipoMltimedia;
	}

	public String getNombreMultimedia() {
		return nombreMultimedia;
	}

	public void setNombreMultimedia(String nombreMultimedia) {
		this.nombreMultimedia = nombreMultimedia;
	}
	
	
	

}
