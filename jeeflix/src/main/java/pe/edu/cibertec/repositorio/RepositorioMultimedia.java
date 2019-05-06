package pe.edu.cibertec.repositorio;

import java.util.List;

import pe.edu.cibertec.modelo.Multimedia;

public interface RepositorioMultimedia {

	void agregar(Multimedia multimedia);

	List<Multimedia> obtenerTodos();

	Multimedia obtenerPorId(Integer id);
}
