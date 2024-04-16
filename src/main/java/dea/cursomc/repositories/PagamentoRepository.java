package dea.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dea.cursomc.domain.Pagamento;

//@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {	
	
	
}
