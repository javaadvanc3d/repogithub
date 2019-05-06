package pe.edu.cibertec.repositorio;

import java.util.List;

import pe.edu.cibertec.modelo.Actor;

public interface RepositorioActor {

	void agregar(Actor actor);

	List<Actor> obtenerTodos();

	Actor obtenerPorId(Integer id);
}
