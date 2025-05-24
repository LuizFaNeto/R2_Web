package com.example.R2.repository;

import com.example.R2.model.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PedidoRepository {
    //Lista de objetos instanciados do Model
    private List<Pedido> pedidos = new ArrayList<>();

    //Icrementa o Id
    private Long nextId = 1L;

    //Find All (Read)
    public List<Pedido> findAll (){
        return pedidos;
    }

    //Find By Id (Read)
    public Optional<Pedido> findById (Long id){
        return pedidos.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    //Save (Create)
    public void save (Pedido pedido){
        pedido.setId(nextId++);
        pedidos.add(pedido);
    }

    //Update (Update)
    public void update (Pedido pedido){
        pedidos.stream().filter(p -> p.getId().equals(pedido.getId()))
                .findFirst().ifPresentOrElse(p1 -> {
                    p1.setData(pedido.getData());
                    p1.setItens(pedido.getItens());
                    p1.setStatus(pedido.getStatus());
                    p1.setUsuario(pedido.getUsuario());
                    p1.setIdUsuario(pedido.getIdUsuario());
                    p1.setEnderecoEntrega(pedido.getEnderecoEntrega());
                    p1.setValorTotal(pedido.getValorTotal());
                }, () -> {
                    throw new RuntimeException("Pedido não encontrado para atualização.");
                });
    }

    //Delete By Id (Delete)
    public void deleteById(Long id){
        pedidos.removeIf(p -> p.getId().equals(id));
    }
}
