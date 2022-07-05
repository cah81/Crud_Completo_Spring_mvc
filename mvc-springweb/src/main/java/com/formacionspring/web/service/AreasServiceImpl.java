package com.formacionspring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionspring.web.dao.AreasRepository;
import com.formacionspring.web.entity.Areas;

@Service
public class AreasServiceImpl implements AreasService {
	
	@Autowired
	private AreasRepository repositorio;

	@Override
	public List<Areas> listaAreas() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Areas guardarAreas(Areas area) {
		// TODO Auto-generated method stub
		return repositorio.save(area);
	}

	@Override
	public Areas obtenerAreasPorId(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

	@Override
	public void  eliminarAreas(Long id) {
		
		 repositorio.deleteById(id);
	}

}
