package com.example.R2.dto.response;

import com.example.R2.model.Produto;

public class EstoqueResponseDTO {
    //Atributos da classe
    private Long id;
    private Produto produto;
    private Long idProduto;
    private int quantidadeDisponivel;

    //Construtor para importar atributos
    public EstoqueResponseDTO() {}

    //Construtor completo
    public EstoqueResponseDTO(Long id, Produto produto, Long idProduto, int quantidadeDisponivel) {
        this.id = id;
        this.produto = produto;
        this.idProduto = idProduto;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    //Getters
    public Long getId() {
        return id;
    }
    public Produto getProduto() {
        return produto;
    }
    public Long getIdProduto() {
        return idProduto;
    }
    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
}
