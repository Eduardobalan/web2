package br.ufms.cpcx.balan.repository;

import br.ufms.cpcx.balan.entity.Cliente;
import br.ufms.cpcx.balan.enuns.EGenero;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class LambdaRepository {

    private List<Cliente> clienteList;

    public LambdaRepository() {
        this.clienteList = Arrays.asList(
                Cliente.builder().id(1L).name("Eduardo").genero(EGenero.MASCULINO).idade(5L).realizouAlgumPedido(Boolean.FALSE).build(),
                Cliente.builder().id(2L).name("Eduarda").genero(EGenero.FEMININO).idade(5L).realizouAlgumPedido(Boolean.FALSE).build(),
                Cliente.builder().id(3L).name("Bruno").genero(EGenero.MASCULINO).idade(10L).realizouAlgumPedido(Boolean.FALSE).build(),
                Cliente.builder().id(4L).name("Bruna").genero(EGenero.FEMININO).idade(10L).realizouAlgumPedido(Boolean.FALSE).build(),
                Cliente.builder().id(5L).name("Fernando").genero(EGenero.MASCULINO).idade(15L).realizouAlgumPedido(Boolean.FALSE).build(),
                Cliente.builder().id(6L).name("Fernanda").genero(EGenero.FEMININO).idade(15L).realizouAlgumPedido(Boolean.FALSE).build(),
                Cliente.builder().id(7L).name("Rafael").genero(EGenero.MASCULINO).idade(20L).realizouAlgumPedido(Boolean.TRUE).build(),
                Cliente.builder().id(8L).name("Rafaela").genero(EGenero.FEMININO).idade(20L).realizouAlgumPedido(Boolean.TRUE).build(),
                Cliente.builder().id(9L).name("Joao").genero(EGenero.MASCULINO).idade(25L).realizouAlgumPedido(Boolean.TRUE).build(),
                Cliente.builder().id(10L).name("Juana").genero(EGenero.FEMININO).idade(25L).realizouAlgumPedido(Boolean.TRUE).build(),
                Cliente.builder().id(11L).name("Mario").genero(EGenero.MASCULINO).idade(30L).realizouAlgumPedido(Boolean.TRUE).build(),
                Cliente.builder().id(12L).name("Maria").genero(EGenero.FEMININO).idade(30L).realizouAlgumPedido(Boolean.TRUE).build(),
                Cliente.builder().id(13L).name("Marcio").genero(EGenero.MASCULINO).idade(50L).realizouAlgumPedido(Boolean.TRUE).build(),
                Cliente.builder().id(14L).name("Marcia").genero(EGenero.FEMININO).idade(50L).realizouAlgumPedido(Boolean.TRUE).build(),
                Cliente.builder().id(15L).name("Juliano").genero(EGenero.MASCULINO).idade(55L).realizouAlgumPedido(Boolean.TRUE).build(),
                Cliente.builder().id(16L).name("Juliana").genero(EGenero.FEMININO).idade(55L).realizouAlgumPedido(Boolean.TRUE).build(),
                Cliente.builder().id(17L).name("Antonio").genero(EGenero.MASCULINO).idade(65L).realizouAlgumPedido(Boolean.FALSE).build(),
                Cliente.builder().id(18L).name("Antonia").genero(EGenero.FEMININO).idade(65L).realizouAlgumPedido(Boolean.FALSE).build(),
                Cliente.builder().id(19L).name("Fabricio").genero(EGenero.MASCULINO).idade(70L).realizouAlgumPedido(Boolean.FALSE).build(),
                Cliente.builder().id(20L).name("Fabricia").genero(EGenero.FEMININO).idade(70L).realizouAlgumPedido(Boolean.FALSE).build()
        );
    }

    public List<Cliente> findAll() {
        return this.clienteList;
    }
}
