package br.ufms.cpcx.balan.pojo;

import br.ufms.cpcx.balan.entity.ItemPedido;
import br.ufms.cpcx.balan.entity.Pedido;
import br.ufms.cpcx.balan.entity.Produto;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ItemPedidoPojo {
    private Long itemPedidoId;
    private Long produtoId;
    private Long quantidade;

    public ItemPedido gerarItemPedido (Pedido pedido){
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setId(this.getItemPedidoId());
        itemPedido.setPedido(pedido);
        itemPedido.setProduto(new Produto(this.getProdutoId()));
        itemPedido.setQuantidade(this.getQuantidade());
        return itemPedido;
    }

    public static ItemPedidoPojo geraItemPedidoPojo (ItemPedido itemPedido){
        ItemPedidoPojo itemPedidoPojo = new ItemPedidoPojo();
        itemPedidoPojo.setItemPedidoId(itemPedido.getId());
        itemPedidoPojo.setProdutoId(itemPedido.getProduto().getId());
        itemPedidoPojo.setQuantidade(itemPedido.getQuantidade());
        return itemPedidoPojo;
    }

    public Long getItemPedidoId() {
        return itemPedidoId;
    }

    public void setItemPedidoId(Long itemPedidoId) {
        this.itemPedidoId = itemPedidoId;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }
}
