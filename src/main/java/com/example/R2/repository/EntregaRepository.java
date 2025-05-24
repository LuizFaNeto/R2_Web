package com.example.R2.repository;

import com.example.R2.model.Entrega;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EntregaRepository {
    //Lista de objetos instanciados do Model
    private List<Entrega> entregas = new ArrayList<>();

    //Incrementa o Id
    private Long nextId = 1L;

    //Find All (Read)
    public List<Entrega> findAll(){
        return entregas;
    }

    //Find By Id (Read)
    public Optional<Entrega> findById(Long id){
        return entregas.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    //Save (Create)
    public Entrega save (Entrega entrega){
        entrega.setId(nextId++);
        entregas.add(entrega);
        return entrega;
    }

    //Update (Update)
    public Entrega update(Entrega entrega){
        entregas.stream().filter(e -> e.getId().equals(entrega.getId()))
                .findFirst().ifPresentOrElse(e1 -> {
                    e1.setDataEstimada(entrega.getDataEstimada());
                    e1.setMetodoEntrega(entrega.getMetodoEntrega());
                    e1.setPedido(entrega.getPedido());
                    e1.setStatusEntrega(entrega.getStatusEntrega());
                    e1.setIdPedido(entrega.getIdPedido());
                    e1.setTaxaEntrega(entrega.getTaxaEntrega());
                },() -> {
                    throw new RuntimeException("Entrega não encontrada para atualização");
                });
                return entrega;
    }

    //Delete By Id (Delete)
    public void deleteById(Long id){
        entregas.removeIf(e -> e.getId().equals(id));
    }
}
