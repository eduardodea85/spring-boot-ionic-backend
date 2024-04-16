package dea.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dea.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {	
	
	
}
