package com.example.R2.service;

import com.example.R2.dto.request.PedidoRequestDTO;
import com.example.R2.dto.response.PedidoResponseDTO;
import com.example.R2.model.Pedido;
import com.example.R2.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoService {
    //Atributo da service para instanciar repository
    private final PedidoRepository pedidoRepository;

    //Construtor da classe
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    //Find All
    public List<PedidoResponseDTO> findAll() {
        return pedidoRepository.findAll().stream().map(p ->
                new PedidoResponseDTO(p.getId(),p.getIdUsuario(),p.getUsuario(),p.getData(),p.getStatus(),p.getValorTotal(),p.getEnderecoEntrega(),p.getItens())
        ).collect(Collectors.toList());
    }

    //Find By Id
    public PedidoResponseDTO findById(Long id) {
        Pedido p = pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
        return new PedidoResponseDTO(p.getId(),p.getIdUsuario(),p.getUsuario(),p.getData(),p.getStatus(),p.getValorTotal(),p.getEnderecoEntrega(),p.getItens());
    }

    //Save
    public PedidoResponseDTO save(PedidoRequestDTO requestDTO) {
        Pedido pedidoNovo = new Pedido(null, requestDTO.getIdUsuario(), requestDTO.getUsuario(),requestDTO.getData(), requestDTO.getStatus(), requestDTO.getValorTotal(), requestDTO.getEnderecoEntrega(), requestDTO.getItens());
        Pedido pedidoSalvo = pedidoRepository.save(pedidoNovo);
        return new PedidoResponseDTO(pedidoSalvo.getId(), pedidoSalvo.getIdUsuario(), pedidoSalvo.getUsuario(), pedidoSalvo.getData(), pedidoSalvo.getStatus(), pedidoSalvo.getValorTotal(), pedidoSalvo.getEnderecoEntrega(), pedidoSalvo.getItens());
    }

    //Update
    public PedidoResponseDTO update(Long id, PedidoRequestDTO requestDTO) {
        Pedido pedidoExiste = pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
        pedidoExiste.setIdUsuario(requestDTO.getIdUsuario());
        pedidoExiste.setUsuario(requestDTO.getUsuario());
        pedidoExiste.setItens(requestDTO.getItens());
        pedidoExiste.setData(requestDTO.getData());
        pedidoExiste.setStatus(requestDTO.getStatus());
        pedidoExiste.setValorTotal(requestDTO.getValorTotal());
        pedidoExiste.setEnderecoEntrega(requestDTO.getEnderecoEntrega());
        Pedido pedidoAtualizado = pedidoRepository.update(pedidoExiste);
        return new PedidoResponseDTO(pedidoAtualizado.getId(), pedidoAtualizado.getIdUsuario(), pedidoAtualizado.getUsuario(), pedidoAtualizado.getData(), pedidoAtualizado.getStatus(), pedidoAtualizado.getValorTotal(), pedidoAtualizado.getEnderecoEntrega(), pedidoAtualizado.getItens());
    }

    //Delete
    public void deleteById(Long id) {
        pedidoRepository.deleteById(id);
    }
}
