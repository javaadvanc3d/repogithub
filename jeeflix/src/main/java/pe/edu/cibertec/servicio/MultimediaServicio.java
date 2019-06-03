package pe.edu.cibertec.servicio;

import java.util.List;

import pe.edu.cibertec.modelo.Multimedia;
import pe.edu.cibertec.repositorio.RepositorioMultimedia;

public class MultimediaServicio {

	private final RepositorioMultimedia repositorioMultimedia;

	public MultimediaServicio(RepositorioMultimedia repositorioMultimedia) {
		this.repositorioMultimedia = repositorioMultimedia;
	}

//	public List<Multimedia> obtenerMultimedias() {
//		return repositorioMultimedia.obtenerTodos();
//	}
//
//	public void agregarMultimedia(Multimedia multimedia) {
//		repositorioMultimedia.agregar(multimedia);
//	}
}
