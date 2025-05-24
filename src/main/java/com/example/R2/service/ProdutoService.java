package com.example.R2.service;

import com.example.R2.dto.request.ProdutoRequestDTO;
import com.example.R2.dto.response.ProdutoResponseDTO;
import com.example.R2.model.Produto;
import com.example.R2.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {
    //Atributo da service para instanciar repository
    private final ProdutoRepository produtoRepository;

    //Construtor da classe
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    //Find All
    public List<ProdutoResponseDTO> findAll() {
        return produtoRepository.findAll().stream().map(p ->
                new ProdutoResponseDTO(p.getId(), p.getNome(), p.getDescricao(), p.getPreco(),p.getTamanho(),p.getCor(),p.getCategoria(),p.getImagem(),p.getQuantidadeEstoque())
        ).collect(Collectors.toList());
    }

    //Find By Id
    public ProdutoResponseDTO findById(Long id) {
        Produto p = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return new ProdutoResponseDTO(p.getId(), p.getNome(), p.getDescricao(), p.getPreco(),p.getTamanho(),p.getCor(),p.getCategoria(),p.getImagem(),p.getQuantidadeEstoque());
    }

    //Save
    public ProdutoResponseDTO save(ProdutoRequestDTO requestDTO) {
        Produto produtoNovo = new Produto(null, requestDTO.getNome(), requestDTO.getDescricao(), requestDTO.getPreco(), requestDTO.getTamanho(), requestDTO.getCor(), requestDTO.getCategoria(), requestDTO.getImagem(), requestDTO.getQuantidadeEstoque());
        Produto produtoSalvo = produtoRepository.save(produtoNovo);
        return new ProdutoResponseDTO(produtoSalvo.getId(), produtoSalvo.getNome(), produtoSalvo.getDescricao(), produtoSalvo.getPreco(), produtoSalvo.getTamanho(), produtoSalvo.getCor(), produtoSalvo.getCategoria(), produtoSalvo.getImagem(), produtoSalvo.getQuantidadeEstoque());
    }

    //Update
    public ProdutoResponseDTO update(Long id, ProdutoRequestDTO requestDTO) {
        Produto produtoExiste = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        produtoExiste.setNome(requestDTO.getNome());
        produtoExiste.setDescricao(requestDTO.getDescricao());
        produtoExiste.setPreco(requestDTO.getPreco());
        produtoExiste.setTamanho(requestDTO.getTamanho());
        produtoExiste.setCor(requestDTO.getCor());
        produtoExiste.setCategoria(requestDTO.getCategoria());
        produtoExiste.setImagem(requestDTO.getImagem());
        produtoExiste.setQuantidadeEstoque(requestDTO.getQuantidadeEstoque());
        Produto produtoAtualizado = produtoRepository.update(produtoExiste);
        return new ProdutoResponseDTO(produtoAtualizado.getId(), produtoAtualizado.getNome(), produtoAtualizado.getDescricao(), produtoAtualizado.getPreco(), produtoAtualizado.getTamanho(), produtoAtualizado.getCor(), produtoAtualizado.getCategoria(), produtoAtualizado.getImagem(), produtoAtualizado.getQuantidadeEstoque());
    }

    //Delete
    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }
}
