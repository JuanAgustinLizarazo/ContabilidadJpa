package net.contabilidad.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		model.addAttribute("mensaje", "Bienvenidos a mi aplicación de contabilidad");
		model.addAttribute("fecha", new Date());
		String nombre ="Auxiliar de Contabilidad";
		Date fechaPub = new Date();
		double salario = 9000.0;
		boolean vigente = true;
		model.addAttribute("nombre", nombre);
		model.addAttribute("fechaPub", fechaPub);
		return "home";
	}
}
