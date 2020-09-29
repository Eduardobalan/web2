package br.ufms.cpcx.balan.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "TB_PEDIDO")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PED_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CLI_ID")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    private Cliente cliente;

//    @ManyToOne
//    @JoinColumn(name = "CLI_ID", updatable = false, insertable = false)
////    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//    @JsonBackReference
//    private Cliente cliente;
//
//    @Column(name = "CLI_ID")
//    private Long clienteId;

    @Column(name = "PED_DATECOMPRA")
    private LocalDate dateCompra;

    @Column(name = "PED_DATEENTREGA")
    private LocalDate dateEntrega;

    @Column(name = "PED_DESCONTO")
    private BigDecimal desconto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDateCompra() {
        return dateCompra;
    }

    public void setDateCompra(LocalDate dateCompra) {
        this.dateCompra = dateCompra;
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
}
