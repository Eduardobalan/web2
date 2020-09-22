package br.ufms.cpcx.balan.service;

import br.ufms.cpcx.balan.entity.Pedido;
import br.ufms.cpcx.balan.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> buscarTodos() {
        return pedidoRepository.findAll();
    }

    public Object buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public Pedido salvar(Pedido pedido) {
            return pedidoRepository.save(pedido);
    }

    public Pedido alterar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }
}
