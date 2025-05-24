package com.example.R2.service;

import com.example.R2.dto.request.CupomDescontoRequestDTO;
import com.example.R2.dto.response.CupomDescontoResponseDTO;
import com.example.R2.model.CupomDesconto;
import com.example.R2.repository.CupomDescontoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CupomDescontoService {
    //Atributo da service para instaciar repository
    private final CupomDescontoRepository cupomDescontoRepository;

    //Contrutor da classe
    public CupomDescontoService(CupomDescontoRepository cupomDescontoRepository) {
        this.cupomDescontoRepository = cupomDescontoRepository;
    }

    //Find All
    public List<CupomDescontoResponseDTO> findAll(){
        return cupomDescontoRepository.findAll().stream().map(cd ->
                new CupomDescontoResponseDTO(cd.getId(),cd.getCodigo(),cd.getDescricao(),cd.getValorDesconto(),cd.getValidade()))
                        .collect(Collectors.toList());
    }

    //Find By Id
    public CupomDescontoResponseDTO findById(Long id){
        CupomDesconto cupomDesconto = cupomDescontoRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Cupom de desconto não encontrado"));
        return new CupomDescontoResponseDTO(cupomDesconto.getId(), cupomDesconto.getCodigo(), cupomDesconto.getDescricao(), cupomDesconto.getValorDesconto(), cupomDesconto.getValidade());
    }

    //Save
    public CupomDescontoResponseDTO save (CupomDescontoRequestDTO requestDTO){
        CupomDesconto novoCupomDesconto = new CupomDesconto(null, requestDTO.getCodigo(), requestDTO.getDescricao(), requestDTO.getValorDesconto(), requestDTO.getValidade());
        CupomDesconto cupomDescontoSalvo = cupomDescontoRepository.save(novoCupomDesconto);
        return new CupomDescontoResponseDTO(cupomDescontoSalvo.getId(), cupomDescontoSalvo.getCodigo(), cupomDescontoSalvo.getDescricao(), cupomDescontoSalvo.getValorDesconto(), cupomDescontoSalvo.getValidade());
    }

    //Update
    public CupomDescontoResponseDTO update(Long id, CupomDescontoRequestDTO requestDTO){
        CupomDesconto cupomDescontoExiste = cupomDescontoRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Cupom de desconto não encontrado"));
        cupomDescontoExiste.setDescricao(requestDTO.getDescricao());
        cupomDescontoExiste.setValorDesconto(requestDTO.getValorDesconto());
        cupomDescontoExiste.setCodigo(requestDTO.getCodigo());
        cupomDescontoExiste.setValidade(requestDTO.getValidade());
        CupomDesconto cupomDescontoAtualizado = cupomDescontoRepository.update(cupomDescontoExiste);
        return new CupomDescontoResponseDTO(cupomDescontoAtualizado.getId(), cupomDescontoAtualizado.getCodigo(), cupomDescontoAtualizado.getDescricao(), cupomDescontoAtualizado.getValorDesconto(), cupomDescontoAtualizado.getValidade());
    }

    //Delete
    public void deleteById(Long id){
        cupomDescontoRepository.deleteById(id);
    }
}
