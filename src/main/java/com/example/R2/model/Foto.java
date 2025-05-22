package com.example.R2.model;

public class Foto {
    //Atribudos da classe
    private Long id;
    private Produto produto;
    private Long idProduto;
    private String imagem;
    private String descricao;

    //Contrutor para importar atributos da classe
    public Foto() {}

    //Contrutor completo
    public Foto(Long id, Produto produto, Long idProduto, String imagem, String descricao) {
        this.id = id;
        this.produto = produto;
        this.idProduto = idProduto;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    //Getter and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
