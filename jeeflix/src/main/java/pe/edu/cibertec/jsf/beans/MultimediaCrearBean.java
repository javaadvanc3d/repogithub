package pe.edu.cibertec.jsf.beans;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Genero;
import pe.edu.cibertec.dominio.Multimedia;
import pe.edu.cibertec.dominio.TipoMultimedia;
import pe.edu.cibertec.servicio.GeneroServicio;
import pe.edu.cibertec.servicio.MultimediaServicio;
import pe.edu.cibertec.servicio.TipoMultimediaServicio;


//@ManagedBean
//@RequestScoped

@Component
@Scope("request")
public class MultimediaCrearBean {

	private Multimedia multimedia;
	private MultimediaServicio multimediaServicio;
	private TipoMultimediaServicio tipoMultimediaServicio;
	private GeneroServicio generoServicio;
	
	private List<TipoMultimedia> listaTipoMultimedia;
	private List<Genero> listaGenero;
	
	/****@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;****/

	public MultimediaCrearBean(MultimediaServicio multimediaServicio, TipoMultimediaServicio tipoMultimediaServicio, GeneroServicio generoServicio) { // Inyectado desde Spring
		this.multimediaServicio= multimediaServicio;
		this.tipoMultimediaServicio =tipoMultimediaServicio;
		this.generoServicio =generoServicio;
		multimedia = new Multimedia();
		multimedia.setTipo(new TipoMultimedia());
		multimedia.setGenero(new Genero());
		multimedia.setCapitulos(1);
		multimedia.setTemporada(1);
		multimedia.setPuntuacion(new BigDecimal("0.0"));
		multimedia.setAnio(2019);
	}

	@PostConstruct
	public void init() {
		cargaListaTipoMultimedia();
		cargaListaGenero();
	} 
	
	
	public void cargaListaTipoMultimedia() {
		System.out.println("->cargaListaTipoMultimedia():::");
		/*****EntityManager em = configuracionAppBean.getEntityManager(); // Siempre a nivel de metodo, No a nivel de clase!
		
		try {
			RepositorioTipoMultimedia tipoMultimedia= new RepositorioTipoMultimediaJpaImpl(em);
			listaTipoMultimedia = tipoMultimedia.obtenerTodos(); 
		} finally {
			em.close();
		}****/
		
		System.out.println("*tipoMultimediaServicio: "+tipoMultimediaServicio);
		listaTipoMultimedia = tipoMultimediaServicio.obtenerTodos();
	}
	
	public void cargaListaGenero() {
		/****EntityManager em = configuracionAppBean.getEntityManager(); // Siempre a nivel de metodo, No a nivel de clase!
		
		try {
			RepositorioGenero genero = new RepositorioGeneroJpaImpl(em); 
			listaGenero = genero.obtenerTodos();
		} finally {
			em.close();
		}****/
		
		listaGenero = generoServicio.obtenerTodos();
	}
	
	public String crearMultimedia() {
		//////EntityManager em = configuracionAppBean.getEntityManager(); // Siempre a nivel de metodo, No a nivel de clase!
		
		try {
			
			if(validarCampos()) {
				
				multimediaServicio.agregar(multimedia);
				/*em.getTransaction().begin();
				
					RepositorioMultimedia repositorioMultimedia = new RepositorioMultimediaJpaImpl(em);
					repositorioMultimedia.agregar(multimedia);
			
				em.getTransaction().commit();*/
				
				return "/mantenimiento/mantMultimedia?faces-redirect=true";
			}

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			///////em.close();
		}
		
		return "#";
	}
	
	public boolean validarCampos() {
		if(!multimedia.getTitulo().isEmpty() && !multimedia.getDesCorta().isEmpty() && multimedia.getTipo().getId()!= 0 && multimedia.getGenero().getId()!=0 && multimedia.getAnio()>0) {
			return true; 
		}else {
			return false;
		}		
	}

	public Multimedia getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}

	/*****************public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}*****************/

	public List<TipoMultimedia> getListaTipoMultimedia() {
		return listaTipoMultimedia;
	}

	public void setListaTipoMultimedia(List<TipoMultimedia> listaTipoMultimedia) {
		this.listaTipoMultimedia = listaTipoMultimedia;
	}

	public List<Genero> getListaGenero() {
		return listaGenero;
	}

	public void setListaGenero(List<Genero> listaGenero) {
		this.listaGenero = listaGenero;
	}
}
