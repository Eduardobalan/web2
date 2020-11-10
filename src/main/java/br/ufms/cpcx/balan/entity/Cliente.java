package br.ufms.cpcx.balan.entity;

import br.ufms.cpcx.balan.enuns.EGenero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_CLIENTE")
@Builder
public class Cliente {

    @Id
    @Column(name = "CLI_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CLI_NAME", length = 256, nullable = false)
    private String name;

//    @OneToMany(mappedBy = "cliente")
//    private List<Pedido> pedidos;

    @Column(name = "CLI_CPF", length = 14)
    private String cpf;

    @Column(name = "CLI_DATA_NASCIMENTO")
    private LocalDate dataNascimento;

    @Transient
    private Boolean realizouAlgumPedido;

    @Transient
    private Long idade;

    @Transient
    private EGenero genero;

    public Cliente(Long id) {
        this.id = id;
    }
}
