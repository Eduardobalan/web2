package br.ufms.cpcx.balan.service;

import br.ufms.cpcx.balan.entity.Cliente;
import br.ufms.cpcx.balan.repository.ClienteRepository;
import br.ufms.cpcx.balan.repository.PedidoRepository;
import br.ufms.cpcx.balan.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    public Object buscarPorId(Long id) {
        Cliente cliente = clienteRepository.findById(id).get();
//        cliente.setPedidos(pedidoRepository.findByClienteId(id));
        cliente.setRealizouAlgumPedido(pedidoRepository.existsByClienteId(id));
        return cliente;
    }

    public Object buscarPedidosPorCliente(Long id) {
        return pedidoRepository.findByClienteId(id);
    }

    public Object buscarProdutoPorCliente(Long id) {
        return produtoRepository.findByCliente(id);
    }

    public Cliente salvar(Cliente cliente) {
            return clienteRepository.save(cliente);
    }

    public Cliente alterar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }


}
