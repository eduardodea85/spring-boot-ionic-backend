package dea.cursomc.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dea.cursomc.domain.Categoria;
import dea.cursomc.services.CategoriaService;

@RestController //anotação indica que é uma classa que usa o controlador REST
@RequestMapping(value="/categorias") //A classe responde pelo caminho do endpoint REST
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	

	//Criar método básico
	//@RequestMapping(value="/{id}", method=RequestMethod.GET) //Para ser uma função REST, precisa associar com uma das funções do http.
	@GetMapping("/{id}") //trocado por causa da vesão 17
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
				
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Categoria obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	//O protocolo http, quando está se inserindo um novo recurso, ele tem um código de resposta particular para isso. Procurar no google, http status code, ex, quando a requisição ocorre com sucesso, ela vai ter um código 201. Quando criar um novo recurso, precisa criar a URI do objeto criado.
	
	
}
