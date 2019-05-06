package pe.edu.cibertec.servicio;

import java.util.List;

import pe.edu.cibertec.modelo.Actor;
import pe.edu.cibertec.repositorio.RepositorioActor;

public class ActorServicio {

	private final RepositorioActor repositorioActor;

	public ActorServicio(RepositorioActor repositorioActor) {
		this.repositorioActor = repositorioActor;
	}

	public List<Actor> obtenerActores() {
		return repositorioActor.obtenerTodos();
	}

	public void agregarActor(Actor actor) {
		repositorioActor.agregar(actor);
	}
}
