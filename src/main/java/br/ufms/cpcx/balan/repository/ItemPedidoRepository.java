package br.ufms.cpcx.balan.repository;

import br.ufms.cpcx.balan.entity.ItemPedido;
import br.ufms.cpcx.balan.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

}
