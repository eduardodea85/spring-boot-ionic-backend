package dea.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dea.cursomc.domain.Cliente;

//@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {	
	
	
}
