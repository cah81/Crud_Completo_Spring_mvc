package com.formacionspring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.formacionspring.web.entity.Areas;
import com.formacionspring.web.service.AreasService;

@Controller
public class AreasController {
	@Autowired
	private AreasService servicio;
	
	@GetMapping({"/areas","/"})
	public String listarAreas(Model modelo) {
		
		modelo.addAttribute("key",servicio.listaAreas());
		return "areas";
		
	}
	@GetMapping("/areas/nuevo")
	public String nuevaArea(Model modelo) {
		
		Areas aer = new Areas();
		
		modelo.addAttribute("areas",aer);
		return "area_nueva";
	}
	@PostMapping("/areas/registrar")
	public String registrarArea(@ModelAttribute Areas area) {
		servicio.guardarAreas(area);
		return "redirect:/areas";
		
	}
	@GetMapping("/areas/modificar/{id}")
	public String editarArea(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("areas",servicio.obtenerAreasPorId(id));
		return "area_editar";
	}
	@PostMapping("/areas/actualizar/{id}")
	public String actualizarArea(@PathVariable Long id,@ModelAttribute("areas")Areas area) {
		Areas actualizaraer = servicio.obtenerAreasPorId(id);
		actualizaraer.setId(id);
		actualizaraer.setNombre(area.getNombre());
		actualizaraer.setCodigo(area.getCodigo());
		servicio.guardarAreas(actualizaraer);
		return "redirect:/areas";
	}
	@GetMapping("/areas/eliminar/{id}")
	public String eliminarArea(@PathVariable Long id) {
		servicio.eliminarAreas(id);
		return "redirect:/areas";
	}
	
	

}
