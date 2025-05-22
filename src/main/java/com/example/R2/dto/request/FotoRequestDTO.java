package com.example.R2.dto.request;

import com.example.R2.model.Produto;

public class FotoRequestDTO {
    //Atribudos da classe
    private ProdutoRequestDTO produto;
    private Long idProduto;
    private String imagem;
    private String descricao;

    //Contrutor para importar atributos da classe
    public FotoRequestDTO() {}

    //Contrutor completo
    public FotoRequestDTO(ProdutoRequestDTO produto, Long idProduto, String imagem, String descricao) {
        this.produto = produto;
        this.idProduto = idProduto;
        this.imagem = imagem;
        this.descricao = descricao;
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
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
