package com.formacionspring.web.service;
import java.util.List;
import com.formacionspring.web.entity.Areas;
public interface AreasService  {
	
	public List<Areas> listaAreas();
	public Areas guardarAreas(Areas area);
	public Areas obtenerAreasPorId(Long id);
	public void eliminarAreas(Long id);
	
	
	

}
