package br.ufms.cpcx.balan.repository;

import br.ufms.cpcx.balan.entity.Pedido;
import br.ufms.cpcx.balan.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    //HQL
    @Query("select p from Pedido p where p.cliente.id = ?1")
    List<Pedido> findByClienteId(Long idCliente);

    Boolean existsByClienteId(Long idCliente);
}
