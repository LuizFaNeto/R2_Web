package com.example.R2.dto.response;

import com.example.R2.model.Pedido;

public class UsuarioResponseDTO {
    //Atributos da classe
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private boolean tipo;
    private String endereco;
    private PedidoResponseDTO historicoCompra;

    //Construtor para importar classe
    public UsuarioResponseDTO() {}

    //Construtor completo
    public UsuarioResponseDTO(Long id, String nome, String email, String senha, boolean tipo, String endereco, PedidoResponseDTO historicoCompra) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
        this.endereco = endereco;
        this.historicoCompra = historicoCompra;
    }

    //Getters
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public boolean isTipo() {
        return tipo;
    }
    public String getEndereco() {
        return endereco;
    }
    public PedidoResponseDTO getHistoricoCompra() {
        return historicoCompra;
    }
}
