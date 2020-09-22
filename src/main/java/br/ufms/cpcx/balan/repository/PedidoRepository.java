package br.ufms.cpcx.balan.repository;

import br.ufms.cpcx.balan.entity.Pedido;
import br.ufms.cpcx.balan.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
