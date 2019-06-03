package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Multimedia;
import pe.edu.cibertec.repositorio.RepositorioMultimedia;


public class RepositorioMultimediaJpaImpl
	extends RepositorioBaseJpaImpl<Multimedia>
	implements RepositorioMultimedia {

	public RepositorioMultimediaJpaImpl(EntityManager em) {
		super(em);
	}

	
	@Override
	public List<Multimedia> obtenerPorTipo(Integer idTipoMultimedia) {
		return em.createQuery(
				"SELECT m FROM multimedia m WHERE m.tipo.id = :idTipoMultimedia", Multimedia.class)
				.setParameter("idTipoMultimedia", idTipoMultimedia)
				.getResultList();
	}

	
	@Override
	public List<Multimedia> obtenerPorGenero(Integer idGeneroMultimedia) {
		return em.createQuery(
				"SELECT m FROM multimedia m WHERE m.genero.id = :idGeneroMultimedia", Multimedia.class)
				.setParameter("idGeneroMultimedia", idGeneroMultimedia)
				.getResultList();
	}
	
}
