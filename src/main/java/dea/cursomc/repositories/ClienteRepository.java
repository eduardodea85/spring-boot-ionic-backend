package dea.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import dea.cursomc.domain.Cliente;

//@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {	
	
	@Transactional(readOnly = true)
	Cliente findByEmail(String email);
}
