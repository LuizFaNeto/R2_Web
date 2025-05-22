package com.example.R2.model;

import java.util.Date;

public class Entrega {
    //Atributos da classe
    private Long id;
    private Pedido pedido;
    private Long idPedido;
    private Date dataEstimada;
    private String statusEntrega;
    private Double taxaEntrega;
    private String metodoEntrega;

    //Contrutor somente para importar os atributos da classe
    public Entrega() {}

    //Construtor completo
    public Entrega(Long id, Pedido pedido, Long idPedido, Date dataEstimada, String statusEntrega, Double taxaEntrega, String metodoEntrega) {
        this.id = id;
        this.pedido = pedido;
        this.idPedido = idPedido;
        this.dataEstimada = dataEstimada;
        this.statusEntrega = statusEntrega;
        this.taxaEntrega = taxaEntrega;
        this.metodoEntrega = metodoEntrega;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Long getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }
    public Date getDataEstimada() {
        return dataEstimada;
    }
    public void setDataEstimada(Date dataEstimada) {
        this.dataEstimada = dataEstimada;
    }
    public String getStatusEntrega() {
        return statusEntrega;
    }
    public void setStatusEntrega(String statusEntrega) {
        this.statusEntrega = statusEntrega;
    }
    public Double getTaxaEntrega() {
        return taxaEntrega;
    }
    public void setTaxaEntrega(Double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
    public String getMetodoEntrega() {
        return metodoEntrega;
    }
    public void setMetodoEntrega(String metodoEntrega) {
        this.metodoEntrega = metodoEntrega;
    }
}
