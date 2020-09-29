package br.ufms.cpcx.balan.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "TB_CLIENTE")
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

    public Cliente() {}

    public Cliente(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRealizouAlgumPedido() {
        return realizouAlgumPedido;
    }

    public void setRealizouAlgumPedido(Boolean realizouAlgumPedido) {
        this.realizouAlgumPedido = realizouAlgumPedido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
