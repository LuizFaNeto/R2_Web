package com.example.R2.dto.request;

public class EstoqueRequestDTO {
    //Atributos da classe
    private ProdutoRequestDTO produto;
    private Long idProduto;
    private int quantidadeDisponivel;

    //Contrutor para importar atributos da classe
    public EstoqueRequestDTO() {}

    //Construtor completo
    public EstoqueRequestDTO(ProdutoRequestDTO produto, Long idProduto, int quantidadeDisponivel) {
        this.produto = produto;
        this.idProduto = idProduto;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    //Getter and Setters
    public ProdutoRequestDTO getProduto() {
        return produto;
    }
    public void setProduto(ProdutoRequestDTO produto) {
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
