package com.example.R2.service;

import com.example.R2.dto.request.EntregaRequestDTO;
import com.example.R2.dto.response.EntregaResponseDTO;
import com.example.R2.model.Entrega;
import com.example.R2.repository.EntregaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntregaService {
    //Atributo da service para instanciar repository
    private final EntregaRepository entregaRepository;

    //Construtor da classe
    public EntregaService(EntregaRepository entregaRepository) {
        this.entregaRepository = entregaRepository;
    }

    //Find All
    public List<EntregaResponseDTO> findAll() {
        return entregaRepository.findAll().stream().map(e ->
                new EntregaResponseDTO(e.getId(), e.getPedido(),e.getIdPedido(),e.getDataEstimada(),e.getStatusEntrega(),e.getTaxaEntrega(),e.getMetodoEntrega())
        ).collect(Collectors.toList());
    }

    //Find By Id
    public EntregaResponseDTO findById(Long id) {
        Entrega e = entregaRepository.findById(id).orElseThrow(() -> new RuntimeException("Entrega não encontrada"));
        return new EntregaResponseDTO(e.getId(), e.getPedido(),e.getIdPedido(),e.getDataEstimada(),e.getStatusEntrega(),e.getTaxaEntrega(),e.getMetodoEntrega());
    }

    //Save
    public EntregaResponseDTO save(EntregaRequestDTO requestDTO) {
        Entrega novaEntrega = new Entrega(null, requestDTO.getPedido(), requestDTO.getIdPedido(), requestDTO.getDataEstimada(), requestDTO.getStatusEntrega(), requestDTO.getTaxaEntrega(), requestDTO.getMetodoEntrega());
        Entrega entregaSalva = entregaRepository.save(novaEntrega);
        return new EntregaResponseDTO(entregaSalva.getId(), entregaSalva.getPedido(), entregaSalva.getIdPedido(), entregaSalva.getDataEstimada(), entregaSalva.getStatusEntrega(), entregaSalva.getTaxaEntrega(), entregaSalva.getMetodoEntrega());
    }

    //Update
    public EntregaResponseDTO update(Long id, EntregaRequestDTO requestDTO) {
        Entrega entregaExiste = entregaRepository.findById(id).orElseThrow(() -> new RuntimeException("Entrega não encontrada"));
        entregaExiste.setIdPedido(requestDTO.getIdPedido());
        entregaExiste.setPedido(requestDTO.getPedido());
        entregaExiste.setDataEstimada(requestDTO.getDataEstimada());
        entregaExiste.setStatusEntrega(requestDTO.getStatusEntrega());
        entregaExiste.setTaxaEntrega(requestDTO.getTaxaEntrega());
        entregaExiste.setMetodoEntrega(requestDTO.getMetodoEntrega());
        Entrega entregaAtualizado = entregaRepository.update(entregaExiste);
        return new EntregaResponseDTO(entregaAtualizado.getId(),entregaAtualizado.getPedido(), entregaAtualizado.getIdPedido(), entregaAtualizado.getDataEstimada(), entregaAtualizado.getStatusEntrega(), entregaAtualizado.getTaxaEntrega(), entregaAtualizado.getMetodoEntrega());
    }

    //Delete
    public void deleteById(Long id) {
        entregaRepository.deleteById(id);
    }
}
