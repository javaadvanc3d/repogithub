package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Genero;
import pe.edu.cibertec.dominio.Multimedia;
import pe.edu.cibertec.dominio.filtro.FiltroMultimedia;
import pe.edu.cibertec.repositorio.RepositorioGenero;
import pe.edu.cibertec.repositorio.RepositorioMultimedia;
import pe.edu.cibertec.repositorio.impl.RepositorioGeneroJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioMultimediaJpaImpl;
import pe.edu.cibertec.servicio.GeneroServicio;
import pe.edu.cibertec.servicio.MultimediaServicio;
import pe.edu.cibertec.servicio.TipoMultimediaServicio;

/////@ManagedBean
/////@ViewScoped


@Component
@Scope("customView")
public class IndexBean {
	
	private List<Multimedia> listaMultimedia;
	private List<Genero> listaGenero;
	private String generoMenu;
	private String anioMenu;
	private String tituloMenu;
	
	private MultimediaServicio multimediaServicio;
	private GeneroServicio generoServicio;

	
	/***@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;***/
	
	
	public IndexBean(MultimediaServicio multimediaServicio, GeneroServicio generoServicio) { // Inyectado desde Spring
		this.multimediaServicio= multimediaServicio;
		this.generoServicio = generoServicio;
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
	    generoMenu = ec.getRequestParameterMap().get("generoFromMenu");
	    anioMenu = ec.getRequestParameterMap().get("anioFromMenu");
	}
	
	
	@PostConstruct
	public void init() {
		cargaListaGeneroMenu();
		cargarMultimedia();
	}
	
	public void cargarMultimedia() {
		/*EntityManager em = configuracionAppBean.getEntityManager();
		RepositorioMultimedia repoMultimedia = new RepositorioMultimediaJpaImpl(em);
		RepositorioMultimedia repoMultimedia = new RepositorioMultimediaJpaImpl();*/
		
		try {
			 FiltroMultimedia filtroMultimedia = new FiltroMultimedia();
			 filtroMultimedia.setTitulo(tituloMenu!=null && !tituloMenu.isEmpty()? tituloMenu: "");
			 filtroMultimedia.setAnio(anioMenu!=null && !anioMenu.equals("Todos")? Integer.parseInt(anioMenu): 0);
			 filtroMultimedia.setIdGenero(generoMenu!=null? Integer.parseInt(generoMenu): 0);
			 listaMultimedia = multimediaServicio.obtenerPorFiltro(filtroMultimedia);    ///////repoMultimedia.obtenerPorFiltro(filtroMultimedia);
			 System.out.println("*listaMultimedia: "+listaMultimedia.size());
		} finally {
			//////em.close();
		}
	}
	
	
	public void cargaListaGeneroMenu() {
		/////////////EntityManager em = configuracionAppBean.getEntityManager(); // Siempre a nivel de metodo, No a nivel de clase!
		
		try {
			///////RepositorioGenero genero = new RepositorioGeneroJpaImpl(em);
			///RepositorioGenero genero = new RepositorioGeneroJpaImpl();
			///listaGenero = genero.obtenerTodos();
			
			listaGenero= generoServicio.obtenerTodos();
			
			Genero gen = new Genero();
			gen.setId(0);
			gen.setNombre("Todos");
			listaGenero.add(gen);
		} finally {
			///////////em.close();
		}
	}
	
	
	public void verDetalle(Multimedia multimedia) {
		if(multimedia !=null) {
			System.out.println("-> verDetalle()::: id: "+multimedia.getId());
		}
	}
	
	
	public void buscarMultimedia() {
		FiltroMultimedia filtroMultimedia = new FiltroMultimedia();
		filtroMultimedia.setTitulo(tituloMenu);
		
		/******EntityManager em = configuracionAppBean.getEntityManager(); // Siempre a nivel de metodo, No a nivel de clase!
		
		try {
			RepositorioMultimedia repoMultimedia = new RepositorioMultimediaJpaImpl(em);
			listaMultimedia = repoMultimedia.obtenerPorFiltro(filtroMultimedia);
		} finally {
			em.close();
		}****/
		
		listaMultimedia = multimediaServicio.obtenerPorFiltro(filtroMultimedia);
	}
	
	
	public List<Genero> getListaGenero() {
		return listaGenero;
	}

	public void setListaGenero(List<Genero> listaGenero) {
		this.listaGenero = listaGenero;
	}

	public List<Multimedia> getListaMultimedia() {
		return listaMultimedia;
	}

	public void setListaMultimedia(List<Multimedia> listaMultimedia) {
		this.listaMultimedia = listaMultimedia;
	}

	/****public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}****/

	public String getGeneroMenu() {
		return generoMenu;
	}

	public void setGeneroMenu(String generoMenu) {
		this.generoMenu = generoMenu;
	}

	public String getAnioMenu() {
		return anioMenu;
	}

	public void setAnioMenu(String anioMenu) {
		this.anioMenu = anioMenu;
	}

	public String getTituloMenu() {
		return tituloMenu;
	}

	public void setTituloMenu(String tituloMenu) {
		this.tituloMenu = tituloMenu;
	}
}
