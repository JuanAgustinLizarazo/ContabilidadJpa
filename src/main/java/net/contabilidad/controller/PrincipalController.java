package net.contabilidad.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

	@GetMapping("/listado")
	public String mostarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero");
		lista.add("Auxiliar");
		lista.add("Contador");
		lista.add("Profesor");
		lista.add("Mario");
		model.addAttribute("empleos", lista);
		return "listado";
	}
	
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
