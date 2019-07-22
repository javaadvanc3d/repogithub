package pe.edu.cibertec.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dominio.Genero;
import pe.edu.cibertec.repositorio.RepositorioGenero;
import pe.edu.cibertec.servicio.GeneroServicio;

@Service
public class GeneroServicioImpl implements GeneroServicio{
	
	private final RepositorioGenero repositorioGenero;
	
	public GeneroServicioImpl(RepositorioGenero repositorioGenero) {
		this.repositorioGenero = repositorioGenero;
	}

	@Transactional()
	@Override
	public void agregar(Genero entidad) {
		repositorioGenero.agregar(entidad);
		
	}

	@Transactional()
	@Override
	public void actualizar(Genero entidad) {
		repositorioGenero.actualizar(entidad);
		
	}

	@Transactional()
	@Override
	public void eliminar(Integer id) {
		repositorioGenero.eliminar(id);
		
	}

	@Transactional()
	@Override
	public Genero obtenerPorId(Integer id) {
		return repositorioGenero.obtenerPorId(id);
	}

	@Transactional()
	@Override
	public List<Genero> obtenerTodos() {
		return repositorioGenero.obtenerTodos();
	}



}
