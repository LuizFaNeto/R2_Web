package com.example.R2.dto.request;

import com.example.R2.model.Pedido;

public class UsuarioRequestDTO {
    //Atributos da classe
    private String nome;
    private String email;
    private String senha;
    private boolean tipo;
    private String endereco;
    private PedidoRequestDTO historicoCompra;

    //Contrutor para importar os atributos da classe
    public UsuarioRequestDTO() {}

    //Contrutor completo
    public UsuarioRequestDTO(String nome, String email, String senha, boolean tipo, String endereco, PedidoRequestDTO historicoCompra) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
        this.endereco = endereco;
        this.historicoCompra = historicoCompra;
    }

    //Getters and Setters
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
    public PedidoRequestDTO getHistoricoCompra() {
        return historicoCompra;
    }
    public void setHistoricoCompra(PedidoRequestDTO historicoCompra) {
        this.historicoCompra = historicoCompra;
    }
}
