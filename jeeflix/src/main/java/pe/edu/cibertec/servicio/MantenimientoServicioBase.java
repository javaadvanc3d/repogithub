package pe.edu.cibertec.servicio;

import java.util.List;

import pe.edu.cibertec.modelo.Entidad;

public interface MantenimientoServicioBase <E extends Entidad> {

	void agregar(E entidad);

	void actualizar(E entidad);

	void eliminar(Integer id);
	
	E obtenerPorId(Integer id);
	
	List<E> obtenerTodos();

}
