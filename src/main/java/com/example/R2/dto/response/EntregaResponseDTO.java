package com.example.R2.dto.response;

import com.example.R2.model.Pedido;

import java.util.Date;

public class EntregaResponseDTO {
    //Atributos da classe
    private Long id;
    private PedidoResponseDTO pedido;
    private Long idPedido;
    private Date dataEstimada;
    private String statusEntrega;
    private Double taxaEntrega;
    private String metodoEntrega;

    //Contrutor para importar atributos
    public EntregaResponseDTO() {}

    //Contrutor completo
    public EntregaResponseDTO(Long id, PedidoResponseDTO pedido, Long idPedido, Date dataEstimada, String statusEntrega, Double taxaEntrega, String metodoEntrega) {
        this.id = id;
        this.pedido = pedido;
        this.idPedido = idPedido;
        this.dataEstimada = dataEstimada;
        this.statusEntrega = statusEntrega;
        this.taxaEntrega = taxaEntrega;
        this.metodoEntrega = metodoEntrega;
    }

    //Getters
    public Long getId() {
        return id;
    }
    public PedidoResponseDTO getPedido() {
        return pedido;
    }
    public Long getIdPedido() {
        return idPedido;
    }
    public Date getDataEstimada() {
        return dataEstimada;
    }
    public String getStatusEntrega() {
        return statusEntrega;
    }
    public Double getTaxaEntrega() {
        return taxaEntrega;
    }
    public String getMetodoEntrega() {
        return metodoEntrega;
    }
}
