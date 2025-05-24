package com.example.R2.repository;

import com.example.R2.model.Estoque;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EstoqueRepository {
    //Lista de objetos instanciados do Model
    private List<Estoque> estoques = new ArrayList<>();

    //Icrementa o Id
    private Long nextId = 1L;

    //Find All (Read)
    public List<Estoque> findAll(){
        return estoques;
    }

    //Find By Id (Read)
    public Optional<Estoque> findById (Long id){
        return estoques.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    //Save (Create)
    public Estoque save (Estoque estoque){
        estoque.setId(nextId++);
        estoques.add(estoque);
        return estoque;
    }

    //Update (Update)
    public Estoque update(Estoque estoque){
        estoques.stream().filter(e -> e.getId().equals(estoque.getId()))
                .findFirst().ifPresentOrElse(e1 -> {
                    e1.setProduto(estoque.getProduto());
                    e1.setIdProduto(estoque.getIdProduto());
                    e1.setQuantidadeDisponivel(estoque.getQuantidadeDisponivel());
                }, () -> {
                    throw new RuntimeException("Estoque não encontrado para atualização");
                });
                return estoque;
    }

    //Delete By Id (Delete)
    public void deleteById(Long id){
        estoques.removeIf(e -> e.getId().equals(id));
    }
}
