package com.example.R2.model;

public class Estoque {
    //Atributos da classe
    private long idCount = 1; //Variável auxiliar pro ID
    private long id;
    private Produto produto;
    private long idProduto;
    private int quantidadeDisponível;

    //Contrutor para importar atributos da classe
    public Estoque() {}

    //Construtor completo
    public Estoque(long id, Produto produto, long idProduto, int quantidadeDisponível) {
        this.id = idCount++; //Icrementa sempre o ID
        this.produto = produto;
        this.idProduto = idProduto;
        this.quantidadeDisponível = quantidadeDisponível;
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
    public int getQuantidadeDisponível() {
        return quantidadeDisponível;
    }
    public void setQuantidadeDisponível(int quantidadeDisponível) {
        this.quantidadeDisponível = quantidadeDisponível;
    }
}
