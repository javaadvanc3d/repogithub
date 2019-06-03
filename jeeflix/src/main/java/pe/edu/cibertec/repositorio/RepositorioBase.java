package pe.edu.cibertec.repositorio;

import java.util.List;

import pe.edu.cibertec.modelo.Entidad;


public interface RepositorioBase<E extends Entidad> {

	void agregar(E entidad);

	void actualizar(E entidad);

	void eliminar(Integer id);
	
	E obtenerPorId(Integer id);
	
	List<E> obtenerTodos();
}

