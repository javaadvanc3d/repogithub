package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Multimedia;
import pe.edu.cibertec.repositorio.RepositorioMultimedia;
import pe.edu.cibertec.repositorio.impl.RepositorioMultimediaJpaImpl;
import pe.edu.cibertec.servicio.MultimediaServicio;

//@ManagedBean
//@ViewScoped


@Component
@Scope("customView")
public class MultimediaBean {
	
	private List<Multimedia> listaMultimedia;
	private MultimediaServicio multimediaServicio;
	
	/*@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;*////
	
	public MultimediaBean(MultimediaServicio multimediaServicio) { // Inyectado desde Spring
		this.multimediaServicio= multimediaServicio;
	}
	
	@PostConstruct
	public void init() {
		listarMultimedia();
	}
		
	public void listarMultimedia() {
		/****EntityManager em = configuracionAppBean.getEntityManager(); // Siempre a nivel de metodo, No a nivel de clase!
		
		try {
			RepositorioMultimedia repoMultimedia = new RepositorioMultimediaJpaImpl(em);
			listaMultimedia = repoMultimedia.obtenerTodos(); 
		} finally {
			em.close();
		}***/
		
		listaMultimedia = multimediaServicio.obtenerTodos(); 
		
	}
	
	public List<Multimedia> getListaMultimedia() {
		return listaMultimedia;
	}

	public void setListaMultimedia(List<Multimedia> listaMultimedia) {
		this.listaMultimedia = listaMultimedia;
	}

	/****public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}****/
}
