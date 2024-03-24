package dea.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotação indica que é uma classa que usa o controlador REST
@RequestMapping(value="/categorias") //A classe responde pelo caminho do endpoint REST
public class CategoriaResource {

	//Criar método básico
	@RequestMapping(method=RequestMethod.GET) //Para ser uma função REST, precisa associar com uma das funções do http.
	public String listar() {
		return "REST está funcionando!";
	}
	
	
	
}
