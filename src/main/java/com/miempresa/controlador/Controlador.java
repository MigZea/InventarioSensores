package com.miempresa.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.miempresa.intefaceServicio.ISensoresServicio;
import com.miempresa.modelo.Sensores;

@Controller
@RequestMapping
public class Controlador {
	@Autowired
	private ISensoresServicio servicio;
	
	@GetMapping("/datosSensores")
	public String listarSensores(Model model) {
		List<Sensores> sensores = servicio.listar();
		model.addAttribute("sensores", sensores);
		return "sensores";
	}
	
	@GetMapping("/agregarSensor")
	public String agregarSensor(Model model) {
	    model.addAttribute("sensor", new Sensores());
	    return "agregarSensor";
	}
	
	@PostMapping("/guardarSensor")
	public String guardarSensor(Sensores p) {
		servicio.guardar(p);
		return "redirect:/datosSensores";
	}
	
	@GetMapping("/editarSensor/{id}")
	public String editarSensor(@PathVariable int id, RedirectAttributes atributos) {
		Optional<Sensores> sensores = servicio.listarId(id);
		atributos.addFlashAttribute("sensor", sensores);
		return "redirect:/mostarSensores";
	}
	
	@GetMapping("/mostarSensores")
	public String mostrarSensores(@ModelAttribute("sensor")Sensores p, Model model) {
		model.addAttribute("sensor", p);
		return "agregarSensor";
	}

}
