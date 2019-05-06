package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import pe.edu.cibertec.modelo.Multimedia;
import pe.edu.cibertec.repositorio.RepositorioMultimedia;

public class RepositorioMultimediaMemoriaImpl implements RepositorioMultimedia{
	
	
	private RepositorioMemoria<Multimedia> datos;
	
	public RepositorioMultimediaMemoriaImpl() {
		datos = new RepositorioMemoria<Multimedia>();
		agregar(new Multimedia(1, "Avengers Endgame", "Película de superhéroes estadounidense de 2019 basada en el grupo los Vengadores de Marvel Comics.", "Descripcion larga...", 9.55, "1", 1, 198, "2019", 1, 1, "01", "01", "movie_avengers_endgame.jpg", "urlAcceso..."));
		agregar(new Multimedia(2, "Stranger Things", "Cuando un niño pequeño desaparece, una pequeña ciudad descubre un misterio que involucra a la ciudad.", "Descripcion larga...", 8.13 , "1", 1, 124, "2016", 1, 1, "01", "01", "movie_stranger_things.jpg", "urlAcceso..."));
		agregar(new Multimedia(3, "Lethal Weapon", "Un ex miembro de Navy SEAL un poco desquiciado consigue un trabajo como oficial de policía en Los Ángeles.", "Descripcion larga...", 7.26 , "1", 2, 110, "2016", 1, 1, "01", "01", "movie_lethal_weapon.jpg", "urlAcceso..."));
	}
	

	@Override
	public void agregar(Multimedia multimedia) {
		datos.agregar(multimedia);
	}

	@Override
	public List<Multimedia> obtenerTodos() {
		return datos.obtenerTodos();
	}

	@Override
	public Multimedia obtenerPorId(Integer id) {
		return datos.obtenerPorId(id);
	}

}
