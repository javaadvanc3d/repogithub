package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Multimedia;
import pe.edu.cibertec.repositorio.RepositorioMultimedia;
import pe.edu.cibertec.repositorio.impl.RepositorioMultimediaJpaImpl;

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
		listarMultimedia();
	}
		
	public void listarMultimedia() {
		EntityManager em = configuracionAppBean.getEntityManager(); // Siempre a nivel de metodo, No a nivel de clase!
		
		try {
			RepositorioMultimedia repoMultimedia = new RepositorioMultimediaJpaImpl(em);
			listaMultimedia = repoMultimedia.obtenerTodos(); 
		} finally {
			em.close();
		}
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
