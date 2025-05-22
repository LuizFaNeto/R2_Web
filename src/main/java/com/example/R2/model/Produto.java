package com.example.R2.model;

public class Produto {
    //Atributos da classe
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private char tamanho;
    private String cor;
    private String categoria;
    private Foto imagem;
    private int quantidadeEstoque;

    //Contrutor para importar atributos da classe
    public Produto() {}

    //Contrutor completo
    public Produto(Long id, String nome, String descricao, Double preco, char tamanho, String cor, String categoria, Foto imagem, int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
        this.categoria = categoria;
        this.imagem = imagem;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public char getTamanho() {
        return tamanho;
    }
    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Foto getImagem() {
        return imagem;
    }
    public void setImagem(Foto imagem) {
        this.imagem = imagem;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
