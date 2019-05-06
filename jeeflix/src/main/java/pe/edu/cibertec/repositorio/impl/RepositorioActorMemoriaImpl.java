package pe.edu.cibertec.repositorio.impl;

import java.util.Date;
import java.util.List;

import pe.edu.cibertec.modelo.Actor;
import pe.edu.cibertec.repositorio.RepositorioActor;

public class RepositorioActorMemoriaImpl implements RepositorioActor{
	
	
	private RepositorioMemoria<Actor> datos;
	
	public RepositorioActorMemoriaImpl() {
		datos = new RepositorioMemoria<Actor>();
		agregar(new Actor(1,"Robert John","Downey Jr.","",new Date(1965,3,4),54,"Masculino","Robert Downey Jr.","Estadounidense","https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Robert_Downey_Jr_2014_Comic_Con_%28cropped%29.jpg/423px-Robert_Downey_Jr_2014_Comic_Con_%28cropped%29.jpg"));
		agregar(new Actor(2,"Christopher Robert","Evans","",new Date(1981,5,13),37,"Masculino","Cevans","Estadounidense","https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/5_Dec._2016_CJCS_USO_Holiday_Tour_-_Incirlik_Air_Base_161205-D-PB383-044_%2831430825446%29_%28cropped%29_%28cropped%29.jpg/220px-5_Dec._2016_CJCS_USO_Holiday_Tour_-_Incirlik_Air_Base_161205-D-PB383-044_%2831430825446%29_%28cropped%29_%28cropped%29.jpg"));
		agregar(new Actor(3,"Christopher","Hemsworth","",new Date(1983,7,11),35,"Masculino","Chris Hemsworth","Australiano","https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Chris_Hemsworth_in_2017_by_Gage_Skidmore_%281%29.jpg/220px-Chris_Hemsworth_in_2017_by_Gage_Skidmore_%281%29.jpg"));
	}
	

	@Override
	public void agregar(Actor actor) {
		datos.agregar(actor);
	}

	@Override
	public List<Actor> obtenerTodos() {
		return datos.obtenerTodos();
	}

	@Override
	public Actor obtenerPorId(Integer id) {
		return datos.obtenerPorId(id);
	}

}
