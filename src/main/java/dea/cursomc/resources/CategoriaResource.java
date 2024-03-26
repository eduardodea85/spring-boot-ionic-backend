package dea.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dea.cursomc.domain.Categoria;
import dea.cursomc.services.CategoriaService;

@RestController //anotação indica que é uma classa que usa o controlador REST
@RequestMapping(value="/categorias") //A classe responde pelo caminho do endpoint REST
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	

	//Criar método básico
	@RequestMapping(value="/{id}", method=RequestMethod.GET) //Para ser uma função REST, precisa associar com uma das funções do http.
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
				
	}
	
	
}
