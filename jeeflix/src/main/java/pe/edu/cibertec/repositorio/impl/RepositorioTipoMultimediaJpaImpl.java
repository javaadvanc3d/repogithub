package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dominio.TipoMultimedia;
import pe.edu.cibertec.repositorio.RepositorioTipoMultimedia;

@Repository
public class RepositorioTipoMultimediaJpaImpl
	extends RepositorioBaseJpaImpl<TipoMultimedia>
	implements RepositorioTipoMultimedia {

	/*public RepositorioTipoMultimediaJpaImpl(EntityManager em) {
		super(em);
	}*/
	
	public RepositorioTipoMultimediaJpaImpl() {
	}

}
