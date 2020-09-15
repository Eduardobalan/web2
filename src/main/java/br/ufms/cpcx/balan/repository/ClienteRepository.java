package br.ufms.cpcx.balan.repository;

import br.ufms.cpcx.balan.entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class ClienteRepository {
    HashMap<Long,Cliente> DB = new HashMap<>();

    public List<Cliente> findAll (){
        List<Cliente> retorno = new ArrayList<>();

        DB.forEach((aLong, cliente) -> retorno.add(cliente));
        return retorno;
    }

    public Cliente save(Cliente cliente){
        DB.put(cliente.getId(), cliente);
        return cliente;
    }

    public void delete(Long id) {
        DB.remove(id);
    }

    public Cliente alterar(Long id, Cliente cliente) {
        this.delete(id);
        return this.save(cliente);
    }

    public Object findById(Long id) {
        return DB.get(id);
    }
}
