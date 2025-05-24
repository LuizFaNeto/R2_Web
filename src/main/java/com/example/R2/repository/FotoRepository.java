package com.example.R2.repository;

import com.example.R2.model.Foto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class FotoRepository {
    //Lista de objetos instanciados do Model
    private List<Foto> fotos = new ArrayList<>();

    //Icrementa o Id
    private Long nextId = 1L;

    //Find All (Read)
    public List<Foto> findAll(){
        return fotos;
    }

    //Find By Id (Read)
    public Optional<Foto> findById (Long id){
        return fotos.stream().filter(f -> f.getId().equals(id)).findFirst();
    }

    //Save (Create)
    public void save (Foto foto){
        foto.setId(nextId++);
        fotos.add(foto);
    }

    //Update (Update)
    public void update(Foto foto){
        fotos.stream().filter(f -> f.getId().equals(foto.getId()))
                .findFirst().ifPresentOrElse(f1 -> {
                    f1.setDescricao(foto.getDescricao());
                    f1.setImagem(foto.getImagem());
                    f1.setProduto(foto.getProduto());
                    f1.setIdProduto(foto.getIdProduto());
                }, () -> {
                    throw new RuntimeException("Foto não encontrada para atualização.");
                });
    }

    //Delete By Id (Delete)
    public void deleteById(Long id){
        fotos.removeIf(f -> f.getId().equals(id));
    }
}
