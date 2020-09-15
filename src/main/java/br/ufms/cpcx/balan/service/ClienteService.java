package br.ufms.cpcx.balan.service;

import br.ufms.cpcx.balan.entity.Cliente;
import br.ufms.cpcx.balan.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    public List<Cliente> buscarTodos(String name, Long idade, String cpf) {
        Cliente cliente = new Cliente();
        cliente.setName(name);
        cliente.setIdade(idade);
        cliente.setCpf(cpf);

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withIgnoreCase()
                .withIgnorePaths("idade");

        Example example = Example.of(cliente, exampleMatcher);

        return clienteRepository.findAll(example);
    }

    public Object buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente salvar(Cliente cliente) {
        if (cliente.getIdade() > 18L) {
            return clienteRepository.save(cliente);
        }
        throw new RuntimeException("Idade", null);
    }

    public Cliente alterar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

}
