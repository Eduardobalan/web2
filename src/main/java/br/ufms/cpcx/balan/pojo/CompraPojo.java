package br.ufms.cpcx.balan.pojo;

import br.ufms.cpcx.balan.entity.Cliente;
import br.ufms.cpcx.balan.entity.Pedido;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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
        CompraPojo compraPojo = new CompraPojo();
        compraPojo.setPedidoId(pedido.getId());
        compraPojo.setClienteId(pedido.getCliente().getId());
        compraPojo.setDateEntrega(pedido.getDateEntrega());
        compraPojo.setDesconto(pedido.getDesconto());
        compraPojo.setItemPedidoDTOS(itemPedidoPojos);
        return compraPojo;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getDateEntrega() {
        return dateEntrega;
    }

    public void setDateEntrega(LocalDate dateEntrega) {
        this.dateEntrega = dateEntrega;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public List<ItemPedidoPojo> getItemPedidoDTOS() {
        return itemPedidoDTOS;
    }

    public void setItemPedidoDTOS(List<ItemPedidoPojo> itemPedidoDTOS) {
        this.itemPedidoDTOS = itemPedidoDTOS;
    }
}
