package br.ufms.cpcx.balan.service;

import br.ufms.cpcx.balan.entity.Cliente;
import br.ufms.cpcx.balan.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        if (cliente.getIdade() > 18L) {
            return clienteRepository.save(cliente);
        }
        throw new RuntimeException("Idade", null);
    }

    public void deletar(Long id) {
        clienteRepository.delete(id);
    }

    public Cliente alterar(Long id, Cliente cliente) {
        return clienteRepository.alterar(id, cliente);
    }

    public Object buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }
}
