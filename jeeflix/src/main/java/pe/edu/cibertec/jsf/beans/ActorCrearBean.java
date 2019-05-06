package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import pe.edu.cibertec.modelo.Actor;
import pe.edu.cibertec.servicio.ActorServicio;


@ManagedBean
@RequestScoped
public class ActorCrearBean {

	private Actor actor;
	private ActorServicio actorServicio;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ActorCrearBean() {
		actor = new Actor();
	}

	@PostConstruct
	public void init() {
		actorServicio = configuracionAppBean.getActorServicio();
	}

	public String crearActor() {
		actorServicio.agregarActor(actor);
		return "/mantenimiento/mantActor?faces-redirect=true";
	}

	public Actor getActor() {
		return actor;
	}
	
	public void setActor(Actor actor) {
		this.actor = actor;
	}


	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
}
