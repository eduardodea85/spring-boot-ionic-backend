package dea.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dea.cursomc.domain.Pedido;

//@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {	
	
	
}
