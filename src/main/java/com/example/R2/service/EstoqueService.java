package com.example.R2.service;

import com.example.R2.dto.request.EstoqueRequestDTO;
import com.example.R2.dto.response.EstoqueResponseDTO;
import com.example.R2.model.Estoque;
import com.example.R2.repository.EstoqueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstoqueService {
    //Atributo da service para instanciar repository
    private final EstoqueRepository estoqueRepository;

    //Construtor da classe
    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    //Find All
    public List<EstoqueResponseDTO> findAll() {
        return estoqueRepository.findAll().stream().map(e ->
                new EstoqueResponseDTO(e.getId(),e.getProduto(),e.getIdProduto(),e.getQuantidadeDisponivel())
        ).collect(Collectors.toList());
    }

    //Find By Id
    public EstoqueResponseDTO findById(Long id) {
        Estoque e = estoqueRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estoque não encontrado"));
        return new EstoqueResponseDTO(e.getId(),e.getProduto(),e.getIdProduto(),e.getQuantidadeDisponivel());
    }

    //Save
    public EstoqueResponseDTO save(EstoqueRequestDTO requestDTO) {
        Estoque estoqueNovo = new Estoque(requestDTO.getIdProduto(), requestDTO.getProduto(), requestDTO.getIdProduto(), requestDTO.getQuantidadeDisponivel());
        Estoque estoqueSalvo = estoqueRepository.save(estoqueNovo);
        return new EstoqueResponseDTO(estoqueSalvo.getId(),estoqueSalvo.getProduto(),estoqueSalvo.getIdProduto(),estoqueSalvo.getQuantidadeDisponivel());
    }

    //Update
    public EstoqueResponseDTO update(Long id, EstoqueRequestDTO requestDTO) {
        Estoque estoqueExiste = estoqueRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estoque não encontrado"));
        estoqueExiste.setIdProduto(requestDTO.getIdProduto());
        estoqueExiste.setQuantidadeDisponivel(requestDTO.getQuantidadeDisponivel());
        Estoque estoqueAtualizado = estoqueRepository.update(estoqueExiste);
        return new EstoqueResponseDTO(estoqueAtualizado.getIdProduto(), estoqueAtualizado.getProduto(), estoqueAtualizado.getIdProduto(), estoqueAtualizado.getQuantidadeDisponivel());
    }

    //Delete
    public void deleteById(Long id) {
        estoqueRepository.deleteById(id);
    }
}
