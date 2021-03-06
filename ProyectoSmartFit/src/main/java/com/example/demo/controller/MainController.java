package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
		
	@RequestMapping("/")
	public String login() {
		return "login";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/crearColaborador")
	public String crearColaborador()
	{	
		return "crearColaborador";
	}
	
	 @GetMapping("/crearAdministrador")
	    public String showNewCourseForm(Model model) {
	        //Course Course = new Course();
	        //model.addAttribute("course", Course);
	        return "crearAdministrador";
	    }
	 @GetMapping("/crearSuperAdministrador")
		public String crearSuperAdministrador()
		{	
			return "crearSuperAdministrador";
		}
	 @GetMapping("/crearSala")
		public String crearSala()
		{	
			return "crearSala";
		}
	 @GetMapping("/crearSede")
		public String crearSede()
		{	
			return "crearSede";
		}
	 @GetMapping("/cerrarSesion")
		public String cerrarSesion()
		{	
			return "login";
		}
	 
	 
	 
}