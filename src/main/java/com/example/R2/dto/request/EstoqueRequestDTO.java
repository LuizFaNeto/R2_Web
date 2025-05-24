package com.example.R2.dto.request;

import com.example.R2.model.Produto;

public class EstoqueRequestDTO {
    //Atributos da classe
    private Produto produto;
    private Long idProduto;
    private int quantidadeDisponivel;

    //Contrutor para importar atributos da classe
    public EstoqueRequestDTO() {}

    //Construtor completo
    public EstoqueRequestDTO(Produto produto, Long idProduto, int quantidadeDisponivel) {
        this.produto = produto;
        this.idProduto = idProduto;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    //Getter and Setters
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Long getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }
    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}
