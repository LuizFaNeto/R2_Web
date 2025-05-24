package com.example.R2.repository;

import com.example.R2.model.CupomDesconto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CupomDescontoRepository {
    //Lista de objetos instanciados do Model
    private List<CupomDesconto> cuponsDescontos= new ArrayList<>();

    //Incrementa o Id
    private Long nextId = 1L;

    //Find All (Read)
    public List<CupomDesconto> findAll(){
        return cuponsDescontos;
    }

    //Find By Id (Read)
    public Optional<CupomDesconto> findById(Long id){
        return cuponsDescontos.stream().filter(cd -> cd.getId().equals(id)).findFirst();
    }

    //Save (Create)
    public CupomDesconto save(CupomDesconto cupomDesconto){
        cupomDesconto.setId(nextId++);
        cuponsDescontos.add(cupomDesconto);
        return cupomDesconto;
    }

    //Update (Update)
    public CupomDesconto update(CupomDesconto cupomDesconto){
        cuponsDescontos.stream().filter(cd -> cd.getId().equals(cupomDesconto.getId()))
                .findFirst().ifPresentOrElse(cd1 -> {
                    cd1.setCodigo(cupomDesconto.getCodigo());
                    cd1.setDescricao(cupomDesconto.getDescricao());
                    cd1.setValidade(cupomDesconto.getValidade());
                    cd1.setValorDesconto(cupomDesconto.getValorDesconto());
                }, () -> {
                    throw new RuntimeException("Cupom não encontrado para atualização");
                });
                return cupomDesconto;
    }

    //Delete By id (Delete)
    public void deleteById(Long id){
        cuponsDescontos.removeIf(cd -> cd.getId().equals(id));
    }
}
