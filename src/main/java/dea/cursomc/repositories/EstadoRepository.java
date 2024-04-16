package dea.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dea.cursomc.domain.Estado;

//@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {	
	
	
}
