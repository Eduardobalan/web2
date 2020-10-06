package br.ufms.cpcx.balan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRO_ID")
    private Long id;

    @Column(name = "PRO_DESCRICAO")
    private String descricao;

    @Column(name = "PRO_QUANTIDADEESTOQUE")
    private Long quantidadeEstoque;

    @Column(name = "PRO_PRECOCOMPRA", precision = 20, scale = 2)
    private BigDecimal precoCompra;

    @Column(name = "PRO_PRECOVENDA", precision = 20, scale = 2)
    private BigDecimal precoVenda;

    public Produto(Long id) {
        this.id = id;
    }
}
