package dea.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dea.cursomc.domain.Cidade;

//@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {	
	
	
}
