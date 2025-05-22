package com.example.R2.model;

public class ItemPedido {
    //Atributos da classe
    private Long id;
    private Long idPedido;
    private Long idProduto;
    Pedido Pedido;
    Produto Produto;
    int quantidade;
    Double precoUnitario;

    //Contrutor para importar atributos
    public ItemPedido() {}

    //Contrutor completo
    public ItemPedido(Long id, Long idPedido, Long idProduto, Pedido pedido, Produto produto, int quantidade, Double precoUnitario) {
        this.id = id;
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        Pedido = pedido;
        Produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    //Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
        return Pedido;
    }
    public void setPedido(Pedido pedido) {
        Pedido = pedido;
    }
    public Produto getProduto() {
        return Produto;
    }
    public void setProduto(Produto produto) {
        Produto = produto;
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
