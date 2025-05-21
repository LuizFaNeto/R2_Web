package com.example.R2.model;

public class ItemPedido {
    //Atributos da classe
    private long idCount = 1; //Variável auxiliar para o ID
    private long id;
    private long idPedido;
    private long idProduto;
    Pedido Pedido;
    Produto Produto;
    int quantidade;
    Double precoUnitario;

    //Contrutor para importar atributos
    public ItemPedido() {}

    //Contrutor completo
    public ItemPedido(long id, long idPedido, long idProduto, Pedido pedido, Produto produto, int quantidade, Double precoUnitario) {
        this.id = idCount++; //Icrementa sempre o ID
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        Pedido = pedido;
        Produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    //Getters e Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }
    public long getIdProduto() {
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
