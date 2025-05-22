package com.example.R2.dto.response;

import com.example.R2.model.Pedido;
import com.example.R2.model.Produto;

public class ItemPedidoResponseDTO {
    //Atributos da classe
    private Long id;
    private Long idPedido;
    private Long idProduto;
    private PedidoResponseDTO pedido;
    private ProdutoResponseDTO produto;
    private int quantidade;
    private Double precoUnitario;

    //Contrutor para importar atributos da classe
    public ItemPedidoResponseDTO() {}

    //Construtor completo
    public ItemPedidoResponseDTO(Long id, Long idPedido, Long idProduto, PedidoResponseDTO pedido, ProdutoResponseDTO produto, int quantidade, Double precoUnitario) {
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
    public PedidoResponseDTO getPedido() {
        return pedido;
    }
    public ProdutoResponseDTO getProduto() {
        return produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public Double getPrecoUnitario() {
        return precoUnitario;
    }
}
