package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import pe.edu.cibertec.modelo.Multimedia;
import pe.edu.cibertec.servicio.MultimediaServicio;


@ManagedBean
@RequestScoped
public class MultimediaCrearBean {

	private Multimedia multimedia;
	private MultimediaServicio multimediaServicio;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public MultimediaCrearBean() {
		multimedia = new Multimedia();
	}

	@PostConstruct
	public void init() {
		multimediaServicio = configuracionAppBean.getMultimediaServicio();
	}

	public String crearMultimedia() {
		multimediaServicio.agregarMultimedia(multimedia);
		return "/mantenimiento/mantMultimedia?faces-redirect=true";
	}

	public Multimedia getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
}
