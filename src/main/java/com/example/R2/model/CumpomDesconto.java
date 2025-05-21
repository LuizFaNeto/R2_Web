package com.example.R2.model;

import java.util.Date;

public class CumpomDesconto {
    //Atributos da classe
    private long idCount = 1; //Váriavel auxiliar para ID
    private long id;
    private String codigo;
    private String descricao;
    private Double valorDesconto;
    private Date validade;

    //Contrutor somente para importar os atributos da classe
    public CumpomDesconto() {}

    //Construtor completo
    public CumpomDesconto(String codigo, String descricao, Double valorDesconto, Date validade) {
        this.id = idCount++; //Id sempre vai icrementar +1
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorDesconto = valorDesconto;
        this.validade = validade;
    }

    // Getter and Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValorDesconto() {
        return valorDesconto;
    }
    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    public Date getValidade() {
        return validade;
    }
    public void setValidade(Date validade) {
        this.validade = validade;
    }
}
