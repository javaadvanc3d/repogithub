package pe.edu.cibertec.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dominio.TipoMultimedia;
import pe.edu.cibertec.repositorio.RepositorioTipoMultimedia;
import pe.edu.cibertec.servicio.TipoMultimediaServicio;

@Service
public class TipoMultimediaServicioImpl implements TipoMultimediaServicio{
	
	private final RepositorioTipoMultimedia repositorioTipoMultimedia;
	
	public TipoMultimediaServicioImpl(RepositorioTipoMultimedia repositorioTipoMultimedia) {
		this.repositorioTipoMultimedia = repositorioTipoMultimedia;
	}

	@Transactional()
	@Override
	public void agregar(TipoMultimedia entidad) {
		repositorioTipoMultimedia.agregar(entidad);

	}

	@Transactional()
	@Override
	public void actualizar(TipoMultimedia entidad) {
		repositorioTipoMultimedia.actualizar(entidad);
		
	}

	@Transactional()
	@Override
	public void eliminar(Integer id) {
		repositorioTipoMultimedia.eliminar(id);
		
	}

	@Transactional()
	@Override
	public TipoMultimedia obtenerPorId(Integer id) {
		return repositorioTipoMultimedia.obtenerPorId(id);
	}

	@Transactional()
	@Override
	public List<TipoMultimedia> obtenerTodos() {
		System.out.println("*repositorioTipoMultimedia: "+repositorioTipoMultimedia);
		return repositorioTipoMultimedia.obtenerTodos();
	}

}
