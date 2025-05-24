package com.example.R2.repository;

import com.example.R2.model.ItemPedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ItemPedidoRepository {
    //Lista de objetos instanciados do Model
    private List<ItemPedido> itensPedidos = new ArrayList<>();

    //Icrementa o Id
    private Long nextId = 1L;

    //Find All (Read)
    public List<ItemPedido> findAll (){
        return itensPedidos;
    }

    //Find By Id (Read)
    public Optional<ItemPedido> findById (Long id){
        return itensPedidos.stream().filter(ip -> ip.getId().equals(id)).findFirst();
    }

    //Save (Create)
    public ItemPedido save (ItemPedido itemPedido){
        itemPedido.setId(nextId++);
        itensPedidos.add(itemPedido);
        return itemPedido;
    }

    //Update (Update)
    public ItemPedido update(ItemPedido itemPedido){
        itensPedidos.stream().filter(ip -> ip.getId().equals(itemPedido.getId()))
                .findFirst().ifPresentOrElse(ip1 -> {
                   ip1.setPedido(itemPedido.getPedido());
                   ip1.setIdPedido(itemPedido.getIdPedido());
                   ip1.setProduto(itemPedido.getProduto());
                   ip1.setIdProduto(itemPedido.getIdProduto());
                   ip1.setPrecoUnitario(itemPedido.getPrecoUnitario());
                   ip1.setQuantidade(itemPedido.getQuantidade());
                }, () -> {
                    throw new RuntimeException("Item pedido não encontrado para atualização.");
                });
                return itemPedido;
    }

    //Delete By Id (Delete)
    public void deleteById(Long id){
        itensPedidos.removeIf(ip -> ip.getId().equals(id));
    }
}
