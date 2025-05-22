package com.example.R2.dto.request;

import com.example.R2.model.Pedido;
import com.example.R2.model.Produto;

public class ItemPedidoRequestDTO {
    //Atributos da classe
    private Long idPedido;
    private Long idProduto;
    private PedidoRequestDTO pedido;
    private ProdutoRequestDTO produto;
    private int quantidade;
    private Double precoUnitario;

    //Contrutor para importar atributos
    public ItemPedidoRequestDTO() {}

    //Contrutor completo
    public ItemPedidoRequestDTO(Long idPedido, Long idProduto, PedidoRequestDTO pedido, ProdutoRequestDTO produto, int quantidade, Double precoUnitario) {
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
    public PedidoRequestDTO getPedido() {
        return pedido;
    }
    public void setPedido(PedidoRequestDTO pedido) {
        this.pedido = pedido;
    }
    public ProdutoRequestDTO getProduto() {
        return produto;
    }
    public void setProduto(ProdutoRequestDTO produto) {
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
