package com.example.R2.dto.response;

import com.example.R2.model.Foto;

public class ProdutoResponseDTO {
    //Atributos da classe
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private char tamanho;
    private String cor;
    private String categoria;
    private FotoResponseDTO imagem;
    private int quantidadeEstoque;

    //Construtor para importar os atributos
    public ProdutoResponseDTO() {}

    //Construtor completo
    public ProdutoResponseDTO(Long id, String nome, String descricao, Double preco, char tamanho, String cor, String categoria, FotoResponseDTO imagem, int quantidadeEstoque) {
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

    //Getters
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public Double getPreco() {
        return preco;
    }
    public char getTamanho() {
        return tamanho;
    }
    public String getCor() {
        return cor;
    }
    public String getCategoria() {
        return categoria;
    }
    public FotoResponseDTO getImagem() {
        return imagem;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
