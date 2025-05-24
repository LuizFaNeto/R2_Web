package com.example.R2.dto.response;

import com.example.R2.model.Pedido;
import com.example.R2.model.Produto;

public class ItemPedidoResponseDTO {
    //Atributos da classe
    private Long id;
    private Long idPedido;
    private Long idProduto;
    private Pedido pedido;
    private Produto produto;
    private int quantidade;
    private Double precoUnitario;

    //Contrutor para importar atributos da classe
    public ItemPedidoResponseDTO() {}

    //Construtor completo
    public ItemPedidoResponseDTO(Long id, Long idPedido, Long idProduto, Pedido pedido, Produto produto, int quantidade, Double precoUnitario) {
        this.id = id;
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    //Getters
    public Long getId() {
        return id;
    }
    public Long getIdPedido() {
        return idPedido;
    }
    public Long getIdProduto() {
        return idProduto;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public Produto getProduto() {
        return produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public Double getPrecoUnitario() {
        return precoUnitario;
    }
}
