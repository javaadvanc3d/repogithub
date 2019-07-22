package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dominio.Multimedia;
import pe.edu.cibertec.dominio.filtro.FiltroMultimedia;
import pe.edu.cibertec.repositorio.RepositorioMultimedia;

@Repository
public class RepositorioMultimediaJpaImpl
	extends RepositorioBaseJpaImpl<Multimedia>
	implements RepositorioMultimedia {

	/*public RepositorioMultimediaJpaImpl(EntityManager em) {
		super(em);
	}*/
	

    public RepositorioMultimediaJpaImpl() {
		
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


	@Override
	public List<Multimedia> obtenerPorFiltro(FiltroMultimedia filtroMultimedia) {
		
		if(filtroMultimedia==null) {
			filtroMultimedia= new FiltroMultimedia();
		}
				
		String jpql="SELECT m FROM Multimedia m "
				   + "WHERE (:titulo IS '' OR m.titulo LIKE CONCAT('%', :titulo, '%'))"
				   + "AND (:anio IS 0 OR m.anio = :anio)"
				   + "AND (:idGenero IS 0 OR m.genero.id = :idGenero)";
		
		return em.createQuery( jpql, claseEntidad)
				.setParameter("titulo", filtroMultimedia.getTitulo())
				.setParameter("anio", filtroMultimedia.getAnio())
				.setParameter("idGenero", filtroMultimedia.getIdGenero())
				.getResultList();
	}
	
}
