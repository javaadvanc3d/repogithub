package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean(eager=true)
@ApplicationScoped
public class ConfiguracionAppBean {
	
	private EntityManagerFactory emf;

	public ConfiguracionAppBean() {
		System.out.println("Creando instancia de ConfiguracionAppBean");
	}

	@PostConstruct
	public void init() {
		emf = Persistence.createEntityManagerFactory("PUJpa"); // Referencia al persistence.xml
		System.out.println("Inicio de ConfiguracionAppBean con EntityManagerFactory UNICO para toda la aplicacion");
	}
	
	@PreDestroy //Antes de destruir la instancia del @ManagedBean al apagar el servidor de aplicaciones, ejecutamos:
	public void finish() {
		emf.close();
	}
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager(); // Obtiene una instancia de EntityManager
	}
	
}
