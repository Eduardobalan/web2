package br.ufms.cpcx.balan.dto;

import br.ufms.cpcx.balan.entity.Produto;

import java.math.BigDecimal;

public class ProdutoDTO {

    private Long id;
    private String descricao;
    private Long quantidadeEstoque;
    private BigDecimal precoCompra;
    private BigDecimal precoVenda;
    private Long quantidadeCompras;
    private BigDecimal totalPrecoCompra;
    private BigDecimal totalPrecoVenda;

    public ProdutoDTO() {
    }

    public ProdutoDTO(Produto produto) {
        this.id = produto.getId();
        this.descricao = produto.getDescricao();
        this.quantidadeEstoque = produto.getQuantidadeEstoque();
        this.precoCompra = produto.getPrecoCompra();
        this.precoVenda = produto.getPrecoVenda();
    }

    public ProdutoDTO(Produto produto, Long quantidadeCompras) {
        this.id = produto.getId();
        this.descricao = produto.getDescricao();
        this.quantidadeEstoque = produto.getQuantidadeEstoque();
        this.precoCompra = produto.getPrecoCompra();
        this.precoVenda = produto.getPrecoVenda();
        this.quantidadeCompras = quantidadeCompras;
    }

    public ProdutoDTO(Produto produto, Long quantidadeCompras, BigDecimal totalPrecoCompra, BigDecimal totalPrecoVenda) {
        this.id = produto.getId();
        this.descricao = produto.getDescricao();
        this.quantidadeEstoque = produto.getQuantidadeEstoque();
        this.precoCompra = produto.getPrecoCompra();
        this.precoVenda = produto.getPrecoVenda();
        this.quantidadeCompras = quantidadeCompras;
        this.totalPrecoCompra = totalPrecoCompra;
        this.totalPrecoVenda = totalPrecoVenda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Long quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Long getQuantidadeCompras() {
        return quantidadeCompras;
    }

    public void setQuantidadeCompras(Long quantidadeCompras) {
        this.quantidadeCompras = quantidadeCompras;
    }

    public BigDecimal getTotalPrecoCompra() {
        return totalPrecoCompra;
    }

    public void setTotalPrecoCompra(BigDecimal totalPrecoCompra) {
        this.totalPrecoCompra = totalPrecoCompra;
    }

    public BigDecimal getTotalPrecoVenda() {
        return totalPrecoVenda;
    }

    public void setTotalPrecoVenda(BigDecimal totalPrecoVenda) {
        this.totalPrecoVenda = totalPrecoVenda;
    }
}
