package com.example.R2.dto.request;

import com.example.R2.model.Pedido;
import com.example.R2.model.Produto;

public class ItemPedidoRequestDTO {
    //Atributos da classe
    private Long idPedido;
    private Long idProduto;
    private Pedido pedido;
    private Produto produto;
    private int quantidade;
    private Double precoUnitario;

    //Contrutor para importar atributos
    public ItemPedidoRequestDTO() {}

    //Contrutor completo
    public ItemPedidoRequestDTO(Long idPedido, Long idProduto, Pedido pedido, Produto
            produto, int quantidade, Double precoUnitario) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    //Getters e Setters
    public Long getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }
    public Long getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
