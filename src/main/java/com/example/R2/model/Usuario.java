package com.example.R2.model;

public class Usuario {
    //Atributos da classe
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private boolean tipo;
    private String endereco;
    private Pedido historicoCompra;

    //Contrutor para importar os atributos da classe
    public Usuario() {}

    //Contrutor completo
    public Usuario(Long id, String nome, String email, String senha, boolean tipo, String endereco, Pedido historicoCompra) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
        this.endereco = endereco;
        this.historicoCompra = historicoCompra;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean isTipo() {
        return tipo;
    }
    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Pedido getHistoricoCompra() {
        return historicoCompra;
    }
    public void setHistoricoCompra(Pedido historicoCompra) {
        this.historicoCompra = historicoCompra;
    }
}
