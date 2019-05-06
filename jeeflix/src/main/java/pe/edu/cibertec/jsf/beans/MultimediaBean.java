package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import pe.edu.cibertec.modelo.Multimedia;
import pe.edu.cibertec.servicio.MultimediaServicio;


@ManagedBean
@ViewScoped
public class MultimediaBean {
	
	private List<Multimedia> listaMultimedia;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	
	public MultimediaBean() {
	
	}
	
	@PostConstruct
	public void init() {
		MultimediaServicio multimediaServicio = configuracionAppBean.getMultimediaServicio();
		listaMultimedia = multimediaServicio.obtenerMultimedias();
	}

	public List<Multimedia> getListaMultimedia() {
		return listaMultimedia;
	}

	public void setListaMultimedia(List<Multimedia> listaMultimedia) {
		this.listaMultimedia = listaMultimedia;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
}
