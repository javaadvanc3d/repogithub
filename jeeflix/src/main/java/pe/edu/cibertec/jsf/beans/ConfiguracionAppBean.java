package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import pe.edu.cibertec.modelo.Actor;
import pe.edu.cibertec.repositorio.RepositorioActor;
import pe.edu.cibertec.repositorio.impl.RepositorioActorMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioMultimediaMemoriaImpl;
import pe.edu.cibertec.servicio.ActorServicio;
import pe.edu.cibertec.servicio.MultimediaServicio;


@ManagedBean(eager=true)
@ApplicationScoped
public class ConfiguracionAppBean {

	private MultimediaServicio multimediaServicio;
	private ActorServicio actorServicio;

	public ConfiguracionAppBean() {
		System.out.println("Creando instancia de ConfiguracionAppBean");
	}

	@PostConstruct
	public void init() {
		multimediaServicio = new MultimediaServicio(new RepositorioMultimediaMemoriaImpl());
		actorServicio = new ActorServicio(new RepositorioActorMemoriaImpl() );
	
	}

	public MultimediaServicio getMultimediaServicio() {
		return multimediaServicio;
	}

	public void setMultimediaServicio(MultimediaServicio multimediaServicio) {
		this.multimediaServicio = multimediaServicio;
	}

	public ActorServicio getActorServicio() {
		return actorServicio;
	}
	
	public void setActorServicio(ActorServicio actorServicio) {
		this.actorServicio = actorServicio;
	}
	
}
