package com.example.R2.dto.response;

import com.example.R2.model.Produto;
import com.example.R2.model.Usuario;

import java.util.Date;

public class PedidoResponseDTO {
    //Atributos da classe
    private Long id;
    private Long idUsuario;
    private Usuario usuario;
    private Date data;
    private String status;
    private Double valorTotal;
    private String enderecoEntrega;
    private Produto itens;

    //Construtor para importar os atrubutos
    public PedidoResponseDTO() {}

    //Construtor completo
    public PedidoResponseDTO(Long id, Long idUsuario, Usuario usuario, Date data, String status, Double valorTotal, String enderecoEntrega, Produto itens) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.data = data;
        this.status = status;
        this.valorTotal = valorTotal;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = itens;
    }

    //Getters
    public Long getId() {
        return id;
    }
    public Long getIdUsuario() {
        return idUsuario;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public Date getData() {
        return data;
    }
    public String getStatus() {
        return status;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }
    public Produto getItens() {
        return itens;
    }
}
