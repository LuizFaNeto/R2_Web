package com.example.R2.model;

import java.util.Date;

public class Pedido {
    //Atributos da classe
    private long idCount = 1; //Variável auxiliar do ID
    private long id;
    private long idUsuario;
    Usuario Usuario;
    Date data;
    String status;
    Double valorTotal;
    String enderecoEntrega;
    Produto itens;

    //Contrutor para importar atributos da classe
    public Pedido() {}

    // Contrutor completo
    public Pedido(long idUsuario, Usuario usuario, Date data, String status, Double valorTotal, String enderecoEntrega, Produto itens) {
        this.id = idCount++; //Incrementa sempre o ID
        this.idUsuario = idUsuario;
        Usuario = usuario;
        this.data = data;
        this.status = status;
        this.valorTotal = valorTotal;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = itens;
    }

    //Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Usuario getUsuario() {
        return Usuario;
    }
    public void setUsuario(Usuario usuario) {
        Usuario = usuario;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }
    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }
    public Produto getItens() {
        return itens;
    }
    public void setItens(Produto itens) {
        this.itens = itens;
    }
}
