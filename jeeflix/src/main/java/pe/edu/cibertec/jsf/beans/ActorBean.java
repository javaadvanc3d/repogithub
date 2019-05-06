package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import pe.edu.cibertec.modelo.Actor;
import pe.edu.cibertec.servicio.ActorServicio;


@ManagedBean
@ViewScoped
public class ActorBean {
	
	private List<Actor> listaActor;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	
	public ActorBean() {
	
	}
	
	@PostConstruct
	public void init() {
		ActorServicio actorServicio= configuracionAppBean.getActorServicio();
		listaActor = actorServicio.obtenerActores();
	}

	public List<Actor> getListaActor() {
		return listaActor;
	}
	
	public void setListaActor(List<Actor> listaActor) {
		this.listaActor = listaActor;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
}
