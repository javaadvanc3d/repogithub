package pe.edu.cibertec.repositorio;


import java.util.List;

import pe.edu.cibertec.dominio.Multimedia;
import pe.edu.cibertec.dominio.filtro.FiltroMultimedia;

public interface RepositorioMultimedia extends RepositorioBase<Multimedia>{

	//	void agregar(Multimedia multimedia);
	//	List<Multimedia> obtenerTodos();
	//	Multimedia obtenerPorId(Integer id);
	
	public List<Multimedia> obtenerPorTipo(Integer idTipoMultimedia);
	public List<Multimedia> obtenerPorGenero(Integer idGeneroMultimedia);
	public List<Multimedia> obtenerPorFiltro(FiltroMultimedia filtroMultimedia);
	
}	


