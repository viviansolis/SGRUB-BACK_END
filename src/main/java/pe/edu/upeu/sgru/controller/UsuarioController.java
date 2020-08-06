package pe.edu.upeu.sgru.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sgru.service.UsuarioService;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioservice;
	@GetMapping("/Usuario")
	
	public List<Map<String, Object>> listar(){
		return usuarioservice.readall();
	}

}
