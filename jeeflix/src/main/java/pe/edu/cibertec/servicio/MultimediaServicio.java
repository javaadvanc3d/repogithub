package pe.edu.cibertec.servicio;

import java.util.List;

import pe.edu.cibertec.dominio.Multimedia;
import pe.edu.cibertec.dominio.filtro.FiltroMultimedia;

public interface MultimediaServicio extends MantenimientoServicioBase<Multimedia>{
	
	public List<Multimedia> obtenerPorTipo(Integer idTipoMultimedia);
	public List<Multimedia> obtenerPorGenero(Integer idGeneroMultimedia);
	public List<Multimedia> obtenerPorFiltro(FiltroMultimedia filtroMultimedia);
}
