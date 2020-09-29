package br.ufms.cpcx.balan.service;

import br.ufms.cpcx.balan.entity.ItemPedido;
import br.ufms.cpcx.balan.entity.Pedido;
import br.ufms.cpcx.balan.entity.Produto;
import br.ufms.cpcx.balan.repository.ItemPedidoRepository;
import br.ufms.cpcx.balan.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public List<Pedido> buscarTodos() {
        return pedidoRepository.findAll();
    }

    public Object buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public Object buscarProdutosPorPedido(Long id) {
        return itemPedidoRepository.buscarProdutosPorPedido(id);
    }

//    public Object buscarProdutosPorPedido(Long id) {
//        List<ItemPedido> itemPedidos = itemPedidoRepository.findByPedidoId(id);
//        List<Produto> produtos = new ArrayList<>();
//
//        for (ItemPedido itemPedido : itemPedidos) {
//            produtos.add(itemPedido.getProduto());
//        }
//
//        return produtos;
//    }

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
