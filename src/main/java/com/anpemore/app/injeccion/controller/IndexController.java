package com.anpemore.app.injeccion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anpemore.app.injeccion.interfaces.IServicios;


@Controller
@RequestMapping("app")
public class IndexController {
	
	// @Autowired para Inyectar por campo
	 private IServicios servicio;
	 
	// @Autowired para inyectar por constructor
     public IndexController(IServicios servicio) {
		this.servicio = servicio;
	}

	@GetMapping("/index")
     public String index(Model model) {
    	 
		model.addAttribute("titulo",servicio.Operacion());
    	 
    	 return "index";
     }

	/*@Autowired //para Inyectar por constructor metodos
	  public void setServicio(IServicios servicio) {
		  this.servicio=servicio;
	 }
	*/
     
	@GetMapping("/detalles")
	public String detalles(Model model) {
		
	    model.addAttribute("titulo", "Citios de Interes");
		
		return "detalles";
	}
	
}
