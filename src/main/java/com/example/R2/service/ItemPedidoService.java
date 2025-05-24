package com.example.R2.service;

import com.example.R2.dto.request.ItemPedidoRequestDTO;
import com.example.R2.dto.response.ItemPedidoResponseDTO;
import com.example.R2.model.ItemPedido;
import com.example.R2.repository.ItemPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemPedidoService {
    //Atributo da service para instanciar repository
    private final ItemPedidoRepository itemPedidoRepository;

    //Construtor da classe
    public ItemPedidoService(ItemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository = itemPedidoRepository;
    }

    //Find All
    public List<ItemPedidoResponseDTO> findAll() {
        return itemPedidoRepository.findAll().stream().map(ip ->
                new ItemPedidoResponseDTO(ip.getId(), ip.getIdPedido(), ip.getIdProduto(), ip.getPedido(),ip.getProduto(), ip.getQuantidade(), ip.getPrecoUnitario())
        ).collect(Collectors.toList());
    }

    //Find By Id
    public ItemPedidoResponseDTO findById(Long id) {
        ItemPedido ip = itemPedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ItemPedido não encontrado"));
        return new ItemPedidoResponseDTO(ip.getId(), ip.getIdPedido(), ip.getIdProduto(), ip.getPedido(),ip.getProduto(), ip.getQuantidade(), ip.getPrecoUnitario());
    }

    //Save
    public ItemPedidoResponseDTO save(ItemPedidoRequestDTO requestDTO) {
        ItemPedido itemPedidoNovo = new ItemPedido(null, requestDTO.getIdPedido(), requestDTO.getIdProduto(), requestDTO.getPedido(),requestDTO.getProduto(), requestDTO.getQuantidade(), requestDTO.getPrecoUnitario());
        ItemPedido itemPedidoSalvo = itemPedidoRepository.save(itemPedidoNovo);
        return new ItemPedidoResponseDTO(itemPedidoSalvo.getId(), itemPedidoSalvo.getIdPedido(), itemPedidoSalvo.getIdProduto(), itemPedidoSalvo.getPedido(), itemPedidoSalvo.getProduto(), itemPedidoSalvo.getQuantidade(), itemPedidoSalvo.getPrecoUnitario());
    }

    //Update
    public ItemPedidoResponseDTO update(Long id, ItemPedidoRequestDTO requestDTO) {
        ItemPedido ItemPedidoExiste = itemPedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ItemPedido não encontrado"));
        ItemPedidoExiste.setIdPedido(requestDTO.getIdPedido());
        ItemPedidoExiste.setIdProduto(requestDTO.getIdProduto());
        ItemPedidoExiste.setPedido(requestDTO.getPedido());
        ItemPedidoExiste.setProduto(requestDTO.getProduto());
        ItemPedidoExiste.setQuantidade(requestDTO.getQuantidade());
        ItemPedidoExiste.setPrecoUnitario(requestDTO.getPrecoUnitario());
        ItemPedido ItemPedidoAtualizado = itemPedidoRepository.update(ItemPedidoExiste);
        return new ItemPedidoResponseDTO(ItemPedidoAtualizado.getId(), ItemPedidoAtualizado.getIdPedido(), ItemPedidoAtualizado.getIdProduto(), ItemPedidoAtualizado.getPedido(), ItemPedidoAtualizado.getProduto(), ItemPedidoAtualizado.getQuantidade(), ItemPedidoAtualizado.getPrecoUnitario());
    }

    //Delete
    public void deleteById(Long id) {
        itemPedidoRepository.deleteById(id);
    }
}
