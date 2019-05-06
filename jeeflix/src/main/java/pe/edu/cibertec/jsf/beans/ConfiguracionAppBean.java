package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import pe.edu.cibertec.repositorio.impl.RepositorioMultimediaMemoriaImpl;
import pe.edu.cibertec.servicio.MultimediaServicio;


@ManagedBean(eager=true)
@ApplicationScoped
public class ConfiguracionAppBean {

	private MultimediaServicio multimediaServicio;

	public ConfiguracionAppBean() {
		System.out.println("Creando instancia de ConfiguracionAppBean");
	}

	@PostConstruct
	public void init() {
		multimediaServicio = new MultimediaServicio(new RepositorioMultimediaMemoriaImpl());
	}

	public MultimediaServicio getMultimediaServicio() {
		return multimediaServicio;
	}

	public void setMultimediaServicio(MultimediaServicio multimediaServicio) {
		this.multimediaServicio = multimediaServicio;
	}

}
