package com.example.R2.dto.response;

import com.example.R2.model.Produto;

public class FotoResponseDTO {
    //Atribudos da classe
    private Long id;
    private Produto produto;
    private Long idProduto;
    private String imagem;
    private String descricao;

    //Construtor para importar atributos
    public FotoResponseDTO() {}

    //Construtor completo
    public FotoResponseDTO(Long id, Produto produto, Long idProduto, String imagem, String descricao) {
        this.id = id;
        this.produto = produto;
        this.idProduto = idProduto;
        this.imagem = imagem;
        this.descricao = descricao;
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
    public String getImagem() {
        return imagem;
    }
    public String getDescricao() {
        return descricao;
    }
}
