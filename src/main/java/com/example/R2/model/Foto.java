package com.example.R2.model;

public class Foto {
    //Atribudos da classe
    private long idCount = 1; //Variável auxiliar pro ID
    private long id;
    private Produto produto;
    private long idProduto;
    private String imagem;
    private String descricao;

    //Contrutor para importar atributos da classe
    public Foto() {}

    //Contrutor completo
    public Foto(Produto produto, long idProduto, String imagem, String descricao) {
        this.id = idCount++; //Sempre icrementa o ID
        this.produto = produto;
        this.idProduto = idProduto;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    //Getter and Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public long getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(long idProduto) {
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
