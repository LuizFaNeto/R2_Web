package com.example.R2.dto.request;

import com.example.R2.model.Foto;

public class ProdutoRequestDTO {
    //Atributos da classe
    private String nome;
    private String descricao;
    private Double preco;
    private char tamanho;
    private String cor;
    private String categoria;
    private FotoRequestDTO imagem;
    private int quantidadeEstoque;

    //Contrutor para importar atributos da classe
    public ProdutoRequestDTO() {}

    //Contrutor completo
    public ProdutoRequestDTO(String nome, String descricao, Double preco, char tamanho, String cor, String categoria, FotoRequestDTO imagem, int quantidadeEstoque) {
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
    public FotoRequestDTO getImagem() {
        return imagem;
    }
    public void setImagem(FotoRequestDTO imagem) {
        this.imagem = imagem;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
