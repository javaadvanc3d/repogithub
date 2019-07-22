package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dominio.Genero;
import pe.edu.cibertec.repositorio.RepositorioGenero;

@Repository
public class RepositorioGeneroJpaImpl
	extends RepositorioBaseJpaImpl<Genero>
	implements RepositorioGenero {

	/*public RepositorioGeneroJpaImpl(EntityManager em) {
		super(em);
	}*/
	
	public RepositorioGeneroJpaImpl() {
	}

}
