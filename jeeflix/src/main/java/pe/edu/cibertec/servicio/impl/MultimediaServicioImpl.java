package pe.edu.cibertec.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dominio.Multimedia;
import pe.edu.cibertec.dominio.filtro.FiltroMultimedia;
import pe.edu.cibertec.repositorio.RepositorioMultimedia;
import pe.edu.cibertec.servicio.MultimediaServicio;

@Service
public class MultimediaServicioImpl implements MultimediaServicio{
	
	private final RepositorioMultimedia repositorioMultimedia;
	

	public MultimediaServicioImpl(RepositorioMultimedia repositorioMultimedia) {
		this.repositorioMultimedia = repositorioMultimedia;
	}

	@Transactional()
	@Override
	public void agregar(Multimedia entidad) {
		repositorioMultimedia.agregar(entidad); 
	}
	
	@Transactional()
	@Override
	public void actualizar(Multimedia entidad) {
		repositorioMultimedia.actualizar(entidad);
	}

	@Transactional()
	@Override
	public void eliminar(Integer id) {
		repositorioMultimedia.eliminar(id);
	}

	@Transactional()
	@Override
	public Multimedia obtenerPorId(Integer id) {
		return repositorioMultimedia.obtenerPorId(id);
	}
	
	@Transactional()
	@Override
	public List<Multimedia> obtenerTodos() {
		return repositorioMultimedia.obtenerTodos();
	}

	@Transactional()
	@Override
	public List<Multimedia> obtenerPorTipo(Integer idTipoMultimedia) {
		return repositorioMultimedia.obtenerPorTipo(idTipoMultimedia);
	}

	@Transactional()
	@Override
	public List<Multimedia> obtenerPorGenero(Integer idGeneroMultimedia) {
		return repositorioMultimedia.obtenerPorGenero(idGeneroMultimedia);
	}

	@Transactional()
	@Override
	public List<Multimedia> obtenerPorFiltro(FiltroMultimedia filtroMultimedia) {
		return repositorioMultimedia.obtenerPorFiltro(filtroMultimedia);
	}

}
