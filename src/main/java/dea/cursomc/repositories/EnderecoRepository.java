package dea.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dea.cursomc.domain.Endereco;

//@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {	
	
	
}
