package br.ufms.cpcx.balan.pojo;

import br.ufms.cpcx.balan.entity.Cliente;
import br.ufms.cpcx.balan.entity.Pedido;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompraPojo {
    private Long pedidoId;
    private Long clienteId;
    private LocalDate dateEntrega;
    private BigDecimal desconto;
    List<ItemPedidoPojo> itemPedidoDTOS;


    public Pedido gerarPedido(){
        Pedido pedido = new Pedido();
        pedido.setId(this.getPedidoId());
        pedido.setCliente(new Cliente(this.getClienteId()));
        pedido.setDesconto(this.getDesconto());
        pedido.setDateCompra(LocalDate.now());
        pedido.setDateEntrega(this.getDateEntrega());

        return pedido;
    }

    public static CompraPojo gerarCompraPojo(Pedido pedido, List<ItemPedidoPojo> itemPedidoPojos){
        return CompraPojo.builder()
                .pedidoId(pedido.getId())
                .clienteId(pedido.getCliente().getId())
                .dateEntrega(pedido.getDateEntrega())
                .desconto(pedido.getDesconto())
                .itemPedidoDTOS(itemPedidoPojos)
                .build();
    }
}
