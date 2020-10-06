package br.ufms.cpcx.balan.entity;

import br.ufms.cpcx.balan.enuns.EStatusPedido;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

    @Enumerated(EnumType.STRING)
    @Column(name = "PED_STATUS")
    private EStatusPedido status;

    @Transient
    private String statusNome;

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
}
