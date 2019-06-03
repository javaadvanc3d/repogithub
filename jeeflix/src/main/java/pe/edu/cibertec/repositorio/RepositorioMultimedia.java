package pe.edu.cibertec.repositorio;


import java.util.List;

import pe.edu.cibertec.dominio.Multimedia;

public interface RepositorioMultimedia extends RepositorioBase<Multimedia>{

	//	void agregar(Multimedia multimedia);
	//	List<Multimedia> obtenerTodos();
	//	Multimedia obtenerPorId(Integer id);
	
	List<Multimedia> obtenerPorTipo(Integer idTipoMultimedia);
	List<Multimedia> obtenerPorGenero(Integer idGeneroMultimedia);
}


